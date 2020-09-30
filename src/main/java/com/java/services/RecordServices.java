package com.java.services;

import com.java.model.Record;
import com.java.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServices {

    private final RecordRepository recordRepository;

    public RecordServices(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<Record> getAll(){
        return recordRepository.findAll ();
    }

    public Record getById(Long id){
        return recordRepository.findById ( id ).orElse ( null );
    }

    public Record create(Record record){
        return recordRepository.save ( record );
    }

    public Record update(Record record){
        return recordRepository.save ( record );
    }

    public void delete(Long id){
        recordRepository.deleteById ( id );
    }
}
