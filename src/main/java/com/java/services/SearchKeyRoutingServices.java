package com.java.services;

import com.java.model.SearchKeyRouting;
import com.java.repository.SearchKeyRoutingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchKeyRoutingServices {

    private final SearchKeyRoutingRepository searchKeyRoutingRepository;

    public SearchKeyRoutingServices(SearchKeyRoutingRepository searchKeyRoutingRepository) {
        this.searchKeyRoutingRepository = searchKeyRoutingRepository;
    }

    public List<SearchKeyRouting> getAll(){
        return searchKeyRoutingRepository.findAll ();
    }

    public SearchKeyRouting getById(Long id){
        return searchKeyRoutingRepository.findById ( id ).orElse ( null );
    }

    public SearchKeyRouting create(SearchKeyRouting searchKeyRouting){
        return searchKeyRoutingRepository.save ( searchKeyRouting );
    }

    public SearchKeyRouting update(SearchKeyRouting searchKeyRouting){
        return searchKeyRoutingRepository.save ( searchKeyRouting );
    }
    public void delete(Long id){
        searchKeyRoutingRepository.deleteById ( id );
    }
}
