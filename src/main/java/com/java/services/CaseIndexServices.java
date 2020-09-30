package com.java.services;

import com.java.model.CaseIndex;
import com.java.repository.CaseIndexRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseIndexServices {

    private final CaseIndexRepository caseIndexRepository;

    public CaseIndexServices(CaseIndexRepository caseIndexRepository) {
        this.caseIndexRepository = caseIndexRepository;
    }

    public List<CaseIndex> getAll(){
        return caseIndexRepository.findAll ();
    }

    public CaseIndex getById(Long id){
        return caseIndexRepository.findById ( id ).orElse ( null );
    }

    public CaseIndex create(CaseIndex caseIndex){
        return  caseIndexRepository.save ( caseIndex );
    }

    public CaseIndex update(CaseIndex caseIndex){
        return  caseIndexRepository.save ( caseIndex );
    }

    public void delete(Long id){
        caseIndexRepository.deleteById ( id );
    }

}
