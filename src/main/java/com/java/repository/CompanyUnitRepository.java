package com.java.repository;

import com.java.model.CompanyUnit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyUnitRepository extends CrudRepository<CompanyUnit, Long> {

    List<CompanyUnit> findAll();
}
