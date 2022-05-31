package com.example.datajpaerror;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import com.example.datajpaerror.entity.CityPersonEntity;
import com.example.datajpaerror.entity.DocAcmeEntity;
import com.example.datajpaerror.entity.DocXptoEntity;

public class App {

    @Transactional
    public void run() {
        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hbm-em");
            EntityManager em = entityManagerFactory.createEntityManager();

            EntityTransaction transaction = em.getTransaction();
            transaction.begin();

            String personName = "Test person";

            CityPersonEntity person = new CityPersonEntity();
            person.setName(personName);
            person.setEmail("test.person@test.com");
            em.persist(person);
            em.flush();

            DocAcmeEntity docAcme = new DocAcmeEntity();
            docAcme.setNumber("1234");
            docAcme.setNewDoc(true);
            docAcme.setFieldX("valX");
            docAcme.setPerson(person);
            person.setDocAcme(docAcme);
            em.persist(docAcme);

            DocXptoEntity docXpto = new DocXptoEntity();
            docXpto.setNumber("9876");
            docXpto.setNewDoc(true);
            docXpto.setFieldY("valY");
            docXpto.setPerson(person);
            person.setDocXpto(docXpto);
            em.persist(docXpto);
            em.flush();

            List<CityPersonEntity> listPeople =
                    em.createQuery("SELECT  cp FROM CityPersonEntity cp", CityPersonEntity.class).getResultList();
            for (CityPersonEntity entity : listPeople) {
                System.out.println("\n========\nID: " + entity.getId() + ", Name: " + entity.getName() + "\nDocAcme: "
                        + entity.getDocAcme().getNumber() + ", fieldX: " + entity.getDocAcme().getFieldX()
                        + "\nDocXpto: " + entity.getDocXpto().getNumber() + ", fieldY: "
                        + entity.getDocXpto().getFieldY() + "\n\n");

            }

            transaction.commit();
            em.close();
            entityManagerFactory.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new App().run();
    }

}
