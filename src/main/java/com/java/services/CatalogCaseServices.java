package com.java.services;

import com.java.model.CatalogCase;
import com.java.repository.CatalogCaseRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogCaseServices {

    private final CatalogCaseRepository catalogCaseRepository;

    public CatalogCaseServices(CatalogCaseRepository catalogCaseRepository) {
        this.catalogCaseRepository = catalogCaseRepository;
    }

    public List<CatalogCase> getAll(){
        return catalogCaseRepository.findAll ();
    }

    public CatalogCase getById(Long id){
        return catalogCaseRepository.findById ( id ).orElse ( null );
    }

    public CatalogCase create(CatalogCase catalogCase){
        return catalogCaseRepository.save ( catalogCase );
    }

    public CatalogCase update(CatalogCase catalogCase){
        return catalogCaseRepository.save ( catalogCase );
    }

    public void delete(Long id){
        catalogCaseRepository.deleteById ( id );
    }
}

