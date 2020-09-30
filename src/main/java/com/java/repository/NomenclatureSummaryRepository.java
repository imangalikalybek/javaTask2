package com.java.repository;

import com.java.model.NomenclatureSummary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NomenclatureSummaryRepository extends CrudRepository<NomenclatureSummary,Long> {

    List<NomenclatureSummary> findAll();
}
