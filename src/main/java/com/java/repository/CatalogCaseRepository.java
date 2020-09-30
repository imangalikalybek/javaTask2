package com.java.repository;

import com.java.model.CatalogCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogCaseRepository extends CrudRepository<CatalogCase, Long> {

    List<CatalogCase> findAll();
}
