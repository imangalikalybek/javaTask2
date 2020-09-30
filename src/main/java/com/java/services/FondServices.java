package com.java.services;

import com.java.model.Fond;
import com.java.repository.FondRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FondServices {

    private final FondRepository fondRepository;

    public FondServices(FondRepository fondRepository) {
        this.fondRepository = fondRepository;
    }

    public List<Fond> getAll(){
        return fondRepository.findAll ();
    }

    public Fond getById(Long id){
        return fondRepository.findById ( id ).orElse ( null );
    }

    public Fond create(Fond fond){
        return fondRepository.save ( fond );
    }

    public Fond update(Fond fond){
        return fondRepository.save ( fond );
    }

    public void delete(Long id){
        fondRepository.deleteById ( id );
    }
}
