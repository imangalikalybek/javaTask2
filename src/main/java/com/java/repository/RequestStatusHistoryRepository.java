package com.java.repository;

import com.java.model.RequestStatusHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestStatusHistoryRepository extends CrudRepository<RequestStatusHistory,Long> {

    List<RequestStatusHistory> findAll();
}
