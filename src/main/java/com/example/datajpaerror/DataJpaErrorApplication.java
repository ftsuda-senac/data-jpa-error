package com.example.datajpaerror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataJpaErrorApplication /* implements CommandLineRunner */ {

    // @Autowired
    // private CityRepository cityRepository;
    //
    // @Autowired
    // private CityPersonRepository cityPersonRepository;
    //
    // @Autowired
    // private DocumentRepository documentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DataJpaErrorApplication.class, args);
    }

    // private void addData() {
    // CityEntity city = new CityEntity();
    // city.setId(1122);
    // city.setName("Test city");
    // cityRepository.save(city);
    //
    // Optional<CityEntity> optCity = cityRepository.findById(city.getId());
    // if (!optCity.isPresent()) {
    // throw new RuntimeException("Error city");
    // }
    //
    // CityPersonEntity person = new CityPersonEntity();
    // person.setName("Test person");
    // person.setEmail("test.person@test.com");
    // person.setCity(optCity.get());
    // person = cityPersonRepository.save(person);
    // cityPersonRepository.flush();
    //
    // DocAcmeEntity docAcme = new DocAcmeEntity();
    // docAcme.setNumber("1234");
    // docAcme.setNewDoc(true);
    // docAcme.setFieldX("valX");
    // docAcme.setPerson(person);
    // person.setDocAcme(docAcme);
    // documentRepository.save(docAcme);
    //
    // DocXptoEntity docXpto = new DocXptoEntity();
    // docXpto.setNumber("9876");
    // docXpto.setCity(optCity.get());
    // docXpto.setNewDoc(true);
    // docXpto.setFieldY("valY");
    // docXpto.setPerson(person);
    // person.setDocXpto(docXpto);
    // documentRepository.save(docXpto);
    // documentRepository.flush();
    //
    // }
    //
    // private void findData() {
    // List<CityPersonEntity> listPeople = cityPersonRepository.findAll();
    // for (CityPersonEntity entity : listPeople) {
    // System.out.println("\n========\nID: " + entity.getId() + ", Name: " + entity.getName() + "\nDocAcme: "
    // + entity.getDocAcme().getNumber() + ", fieldX: " + entity.getDocAcme().getFieldX() + "\nDocXpto: "
    // + entity.getDocXpto().getNumber() + ", fieldY: " + entity.getDocXpto().getFieldY() + "\n\n");
    // }
    // }
    //
    // @Override
    // @Transactional
    // public void run(String... args) throws Exception {
    // // addData();
    // // findData();
    // }

}
