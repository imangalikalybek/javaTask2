package com.java.services;

import com.java.model.Case;
import com.java.repository.CaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseServices {

    public final CaseRepository caseRepository;

    public CaseServices(CaseRepository caseRepository) {
        this.caseRepository = caseRepository;
    }

    public List<Case> getAll(){
        return caseRepository.findAll ();
    }

    public Case getById(Long id){
        return caseRepository.findById ( id ).orElse ( null );
    }

    public Case create(Case cases){
        return caseRepository.save ( cases );
    }

    public Case update(Case cases){
        return caseRepository.save ( cases );
    }

    public void delete(Long id){
        caseRepository.deleteById ( id );
    }
}
