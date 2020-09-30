package com.java.services;

import com.java.model.File;
import com.java.repository.FileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServices {

    private final FileRepository fileRepository;

    public FileServices(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public List<File> getAll(){
        return fileRepository.findAll ();
    }

    public File getById(Long id){
        return fileRepository.findById ( id ).orElse ( null );
    }

    public File create(File file){
        return fileRepository.save ( file );
    }

    public File update(File file){
        return fileRepository.save ( file );
    }

    public void delete(Long id){
        fileRepository.deleteById ( id );
    }
}
