package com.java.services;

import com.java.model.Share;
import com.java.repository.ShareRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareServices {

    private final ShareRepository shareRepository;

    public ShareServices(ShareRepository shareRepository) {
        this.shareRepository = shareRepository;
    }

    public List<Share> getAll(){
        return shareRepository.findAll ();
    }

    public  Share getById(Long id){
        return shareRepository.findById ( id ).orElse ( null );
    }

    public Share create(Share share){
        return shareRepository.save ( share );
    }

    public Share update(Share share){
        return shareRepository.save ( share );
    }

    public void delete(Long id){
        shareRepository.deleteById (  id);
    }
}
