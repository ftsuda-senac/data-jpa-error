package com.example.datajpaerror.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@NoArgsConstructor
public abstract class DocumentEntity {

    @EmbeddedId
    protected DocumentEntityId id;

    @Column(length = 64, nullable = false)
    protected String number;


    @OneToOne(fetch = FetchType.EAGER, targetEntity = PersonEntity.class)
    @JoinColumn(name = "person_id", foreignKey = @ForeignKey(name = "fk_document_person_id"))
    @MapsId("personId")
    protected CityPersonEntity person;

    @Transient
    protected boolean newDoc;

    public void setPerson(CityPersonEntity person) {
        this.person = person;
        if (this.person.getId() != null) {
            if (this.id == null) {
                this.id = new DocumentEntityId();
                this.id.setType(getType());
            }
            this.id.setPersonId(person.getId());
        }
    }

    public abstract Integer getType();



    // @PrePersist
    // public void generateId() {
    // this.id = new DocumentEntityId();
    // this.id.setPersonId(this.person.getId());
    // this.id.setType(getType());
    // }

}
