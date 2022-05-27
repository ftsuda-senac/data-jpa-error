package com.example.datajpaerror.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.datajpaerror.entity.CityPersonEntity;

@Repository
public interface CityPersonRepository extends JpaRepository<CityPersonEntity, Long> {

}
