package com.java.services;

import com.java.model.Authorization;
import com.java.repository.AuthorizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationServices {

    public final AuthorizationRepository authorizationRepository;

    public AuthorizationServices(AuthorizationRepository authorizationRepository) {
        this.authorizationRepository = authorizationRepository;
    }

    public List<Authorization> getAll(){

        return authorizationRepository.findAll();
    }

    public Authorization getById(Long id){
        return authorizationRepository.findById ( id ).orElse ( null );
    }

    public Authorization create(Authorization authorization){
        return authorizationRepository.save ( authorization );
    }

    public Authorization update(Authorization authorization){
        return authorizationRepository.save ( authorization );
    }

    public void delete(Long id){
        authorizationRepository.deleteById ( id );
    }
}
