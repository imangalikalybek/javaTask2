package com.java.repository;

import com.java.model.CaseIndex;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseIndexRepository extends CrudRepository<CaseIndex,Long> {

    List<CaseIndex> findAll();
}
