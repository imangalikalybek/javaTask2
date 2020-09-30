package com.java.services;

import com.java.model.Tempfiles;
import com.java.repository.TempfilesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempfilesServices {

    private final TempfilesRepository tempfilesRepository;

    public TempfilesServices(TempfilesRepository tempfilesRepository) {
        this.tempfilesRepository = tempfilesRepository;
    }

    public List<Tempfiles> getAll(){
        return tempfilesRepository.findAll ();
    }

    public Tempfiles getById(Long id){
        return tempfilesRepository.findById (  id).orElse ( null );
    }

    public Tempfiles create(Tempfiles tempfiles){
        return tempfilesRepository.save ( tempfiles );
    }

    public Tempfiles update(Tempfiles tempfiles){
        return tempfilesRepository.save ( tempfiles );
    }

    public void delete(Long id){
        tempfilesRepository.deleteById ( id );
    }
}
