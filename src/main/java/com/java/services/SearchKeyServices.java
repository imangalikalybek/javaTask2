package com.java.services;

import com.java.model.SearchKey;
import com.java.repository.SearchKeyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchKeyServices {

    private final SearchKeyRepository searchKeyRepository;

    public SearchKeyServices(SearchKeyRepository searchKeyRepository) {
        this.searchKeyRepository = searchKeyRepository;
    }

    public List<SearchKey> getAll(){
        return searchKeyRepository.findAll ();
    }

    public SearchKey getById(Long id){
        return searchKeyRepository.findById ( id ).orElse ( null );
    }

    public SearchKey create(SearchKey searchKey){
        return searchKeyRepository.save ( searchKey );
    }

    public SearchKey update(SearchKey searchKey){
        return searchKeyRepository.save ( searchKey );
    }

    public void delete(Long id){
        searchKeyRepository.deleteById ( id );
    }

}
