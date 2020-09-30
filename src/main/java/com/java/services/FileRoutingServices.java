package com.java.services;

import com.java.model.FileRouting;
import com.java.repository.FileRoutingRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileRoutingServices {

    private final FileRoutingRepository fileRoutingRepository;

    public FileRoutingServices(FileRoutingRepository fileRoutingRepository) {
        this.fileRoutingRepository = fileRoutingRepository;
    }

    public List<FileRouting> getAll(){
        return fileRoutingRepository.findAll ();
    }

    public FileRouting getById(Long id){
        return fileRoutingRepository.findById ( id ).orElse ( null );
    }

    public FileRouting create(FileRouting fileRouting){
        return fileRoutingRepository.save ( fileRouting );
    }

    public FileRouting update(FileRouting fileRouting){
        return fileRoutingRepository.save ( fileRouting );
    }

    public void delete(Long id){
        fileRoutingRepository.deleteById ( id );
    }
}
