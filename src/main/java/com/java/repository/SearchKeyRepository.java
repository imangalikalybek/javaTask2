package com.java.repository;

import com.java.model.SearchKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchKeyRepository extends CrudRepository<SearchKey,Long> {
    List<SearchKey> findAll();
}
