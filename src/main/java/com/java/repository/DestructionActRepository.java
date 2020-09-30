package com.java.repository;

import com.java.model.DestructionAct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestructionActRepository extends CrudRepository<DestructionAct, Long> {

    List<DestructionAct> findAll();
}
