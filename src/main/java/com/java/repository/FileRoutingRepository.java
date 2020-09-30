package com.java.repository;

import com.java.model.FileRouting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRoutingRepository extends CrudRepository<FileRouting,Long> {

    List<FileRouting> findAll();
}
