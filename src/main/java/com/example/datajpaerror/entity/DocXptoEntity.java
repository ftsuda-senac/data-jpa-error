package com.example.datajpaerror.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "doc_xpto")
@Getter
@Setter
@NoArgsConstructor
public class DocXptoEntity extends DocumentEntity {

    @MapsId("type")
    @Column(insertable = false, updatable = false) // XXX Used to AVOID Repeated column in mapping (type is in DocumentEntityId)
    private Integer type = 2;

    private String fieldY;


}
