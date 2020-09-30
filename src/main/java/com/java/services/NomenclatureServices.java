package com.java.services;

import com.java.model.Nomenclature;
import com.java.repository.NomenclatureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NomenclatureServices {

    private final NomenclatureRepository nomenclatureRepository;

    public NomenclatureServices(NomenclatureRepository nomenclatureRepository) {
        this.nomenclatureRepository = nomenclatureRepository;
    }

    public List<Nomenclature> getAll(){
        return nomenclatureRepository.findAll ();
    }

    public Nomenclature getById(Long id){
        return nomenclatureRepository.findById ( id ).orElse ( null );
    }

    public Nomenclature create(Nomenclature nomenclature){
        return nomenclatureRepository.save ( nomenclature );
    }

    public Nomenclature update(Nomenclature nomenclature){
        return nomenclatureRepository.save ( nomenclature );
    }

    public void delete(Long id){
        nomenclatureRepository.deleteById ( id );
    }
}
