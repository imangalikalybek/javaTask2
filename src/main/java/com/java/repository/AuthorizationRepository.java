package com.java.repository;

import com.java.model.Authorization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorizationRepository extends CrudRepository<Authorization, Long> {


    List<Authorization> findAll();
}
