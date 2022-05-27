package com.example.datajpaerror.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EntityListeners(AuditingEntityListener.class)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_city_person_person_id"))
@Table(name = "city_person")
@Getter
@Setter
@NoArgsConstructor
public class CityPersonEntity extends PersonEntity {

    @OneToOne(mappedBy = "person", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH }, orphanRemoval = true)
    private DocAcmeEntity docAcme;

    @OneToOne(mappedBy = "person", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH }, orphanRemoval = true)
    private DocXptoEntity docXpto;

}
