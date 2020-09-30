package com.java.services;

import com.java.model.Request;
import com.java.repository.RequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServices {

    private final RequestRepository requestRepository;

    public RequestServices(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<Request> getAll(){
        return requestRepository.findAll ();
    }

    public Request getById(Long id){
        return requestRepository.findById ( id ).orElse ( null );
    }

    public Request create(Request request){
        return requestRepository.save ( request );
    }

    public Request update(Request request){
        return requestRepository.save ( request );
    }

    public void delete(Long id){
        requestRepository.deleteById ( id );
    }
}
