package com.java.services;

import com.java.model.Catalog;
import com.java.repository.CatalogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServices {

    private final CatalogRepository catalogRepository;

    public CatalogServices(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public List<Catalog> getAll(){
        return catalogRepository.findAll();
    }

    public Catalog getById(Long id) {
        return catalogRepository.findById (id  ).orElse ( null );
    }

    public Catalog create(Catalog catalog){
        return catalogRepository.save ( catalog );
    }

    public Catalog update(Catalog catalog){
        return catalogRepository.save ( catalog );
    }

    public void delete(Long id){
        catalogRepository.deleteById ( id );
    }
}
