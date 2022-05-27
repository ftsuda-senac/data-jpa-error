package com.example.datajpaerror.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.MapsId;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "doc_acme")
@Getter
@Setter
@NoArgsConstructor
public class DocAcmeEntity extends DocumentEntity {

    @MapsId("type")
    @Column(insertable = false, updatable = false) // XXX Used to AVOID Repeated column in mapping (type is in DocumentEntityId)
    private Integer type = 1;

    private String fieldX;

}
