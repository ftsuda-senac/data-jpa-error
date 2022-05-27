package com.example.datajpaerror.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.datajpaerror.entity.DocumentEntity;
import com.example.datajpaerror.entity.DocumentEntityId;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentEntity, DocumentEntityId> {

}
