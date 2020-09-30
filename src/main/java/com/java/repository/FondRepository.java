package com.java.repository;

import com.java.model.Fond;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FondRepository extends CrudRepository<Fond,Long> {

    List<Fond> findAll();
}
