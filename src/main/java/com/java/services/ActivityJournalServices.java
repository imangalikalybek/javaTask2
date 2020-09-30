package com.java.services;

import com.java.model.ActivityJournal;
import com.java.repository.ActivityJournalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityJournalServices {

    private final ActivityJournalRepository activityJournalRepository;

    public ActivityJournalServices(ActivityJournalRepository activityJournalRepository) {
        this.activityJournalRepository = activityJournalRepository;
    }

    public List<ActivityJournal> getAll(){
        return activityJournalRepository.findAll ();
    }

    public ActivityJournal getById(Long id){
        return activityJournalRepository.findById ( id ).orElse ( null );
    }

    public ActivityJournal create(ActivityJournal activityJournal){
        return activityJournalRepository.save ( activityJournal );
    }

    public ActivityJournal update(ActivityJournal activityJournal){
        return activityJournalRepository.save ( activityJournal );
    }

    public void delete(Long id){
        activityJournalRepository.deleteById ( id );
    }
}
