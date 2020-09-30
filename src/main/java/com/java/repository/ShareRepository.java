package com.java.repository;

import com.java.model.Share;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShareRepository extends CrudRepository<Share,Long> {

    List<Share> findAll();
}
