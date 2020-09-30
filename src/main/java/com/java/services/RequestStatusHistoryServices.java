package com.java.services;

import com.java.model.RequestStatusHistory;
import com.java.repository.RequestStatusHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestStatusHistoryServices {

    private final RequestStatusHistoryRepository requestStatusHistoryRepository;

    public RequestStatusHistoryServices(RequestStatusHistoryRepository requestStatusHistoryRepository) {
        this.requestStatusHistoryRepository = requestStatusHistoryRepository;
    }

    public List<RequestStatusHistory> getAll(){
        return requestStatusHistoryRepository.findAll ();
    }

    public RequestStatusHistory getById(Long id){
        return requestStatusHistoryRepository.findById ( id ).orElse ( null );
    }

    public RequestStatusHistory create(RequestStatusHistory requestStatusHistory){
        return requestStatusHistoryRepository.save ( requestStatusHistory );
    }

    public RequestStatusHistory update(RequestStatusHistory requestStatusHistory){
        return requestStatusHistoryRepository.save ( requestStatusHistory );
    }

    public void delete(Long id){
        requestStatusHistoryRepository.deleteById ( id );
    }


}
