package com.java.services;

import com.java.model.NomenclatureSummary;
import com.java.repository.NomenclatureSummaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NomenclatureSummaryServices {

    private final NomenclatureSummaryRepository nomenclatureSummaryRepository;

    public NomenclatureSummaryServices(NomenclatureSummaryRepository nomenclatureSummaryRepository) {
        this.nomenclatureSummaryRepository = nomenclatureSummaryRepository;
    }

    public List<NomenclatureSummary> getAll(){
        return nomenclatureSummaryRepository.findAll ();
    }

    public NomenclatureSummary getById(Long id){
        return nomenclatureSummaryRepository.findById ( id ).orElse ( null );
    }

    public NomenclatureSummary create(NomenclatureSummary nomenclatureSummary){
        return nomenclatureSummaryRepository.save ( nomenclatureSummary );
    }

    public NomenclatureSummary update(NomenclatureSummary nomenclatureSummary){
        return nomenclatureSummaryRepository.save ( nomenclatureSummary );
    }

    public void delete(Long id ){
        nomenclatureSummaryRepository.deleteById ( id );
    }
}
