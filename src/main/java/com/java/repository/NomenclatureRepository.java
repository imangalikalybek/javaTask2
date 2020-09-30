package com.java.repository;

import com.java.model.Nomenclature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NomenclatureRepository extends CrudRepository<Nomenclature, Long> {

    List<Nomenclature> findAll();
}
