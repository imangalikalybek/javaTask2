package com.java.repository;

import com.java.model.ActivityJournal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityJournalRepository extends CrudRepository<ActivityJournal,Long> {

    List<ActivityJournal> findAll();
}
