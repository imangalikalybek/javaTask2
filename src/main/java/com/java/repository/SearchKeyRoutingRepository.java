package com.java.repository;

import com.java.model.SearchKeyRouting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SearchKeyRoutingRepository extends CrudRepository<SearchKeyRouting, Long> {

    List<SearchKeyRouting> findAll();
}
