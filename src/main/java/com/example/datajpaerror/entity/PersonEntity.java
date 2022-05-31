package com.example.datajpaerror.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "person", uniqueConstraints = {@UniqueConstraint(name = "uk_person_email", columnNames = "email")})
@Getter
@Setter
@NoArgsConstructor
public class PersonEntity {

    @Id
    @SequenceGenerator(name = "person_id_generator", sequenceName = "seq_person_id", allocationSize = 1,
            initialValue = 1)
    @GeneratedValue(generator = "person_id_generator")
    private Long id;

    @Column(length = 128, nullable = false)
    private String email;

    @Column(length = 200, nullable = false)
    private String name;

}
