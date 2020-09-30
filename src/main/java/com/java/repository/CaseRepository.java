package com.java.repository;

import com.java.model.Case;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepository extends CrudRepository<Case, Long> {

    List<Case> findAll();
}
