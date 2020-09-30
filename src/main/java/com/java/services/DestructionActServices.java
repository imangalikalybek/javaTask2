package com.java.services;

import com.java.model.DestructionAct;
import com.java.repository.DestructionActRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestructionActServices {

    private final DestructionActRepository destructionActRepository;

    public DestructionActServices(DestructionActRepository destructionActRepository) {
        this.destructionActRepository = destructionActRepository;
    }

    public List<DestructionAct> getAll(){
        return destructionActRepository.findAll ();
    }

    public DestructionAct getById(Long id){
        return destructionActRepository.findById ( id ).orElse ( null );
    }

    public DestructionAct create(DestructionAct destructionAct){
        return destructionActRepository.save ( destructionAct );
    }

    public DestructionAct update(DestructionAct destructionAct){
        return destructionActRepository.save ( destructionAct );
    }

    public void delete(Long id){
        destructionActRepository.deleteById ( id );
    }

}
