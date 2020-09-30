package com.java.repository;

import com.java.model.Catalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends CrudRepository<Catalog, Long> {

    List<Catalog> findAll();
}
