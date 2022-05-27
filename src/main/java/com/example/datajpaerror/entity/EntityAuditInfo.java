package com.example.datajpaerror.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class EntityAuditInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime createDate;

    @Column
    @LastModifiedDate
    private LocalDateTime lastUpdateDate;


    public EntityAuditInfo(LocalDateTime createDate) {
        this.createDate = createDate;
        this.lastUpdateDate = createDate;
    }



}
