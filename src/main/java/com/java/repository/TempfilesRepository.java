package com.java.repository;

import com.java.model.Tempfiles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TempfilesRepository extends CrudRepository<Tempfiles,Long> {

    List<Tempfiles> findAll();
}
