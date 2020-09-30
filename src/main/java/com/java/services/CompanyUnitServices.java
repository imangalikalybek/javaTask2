package com.java.services;

import com.java.model.CompanyUnit;
import com.java.repository.CompanyUnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyUnitServices {

    private final CompanyUnitRepository companyUnitRepository;

    public CompanyUnitServices(CompanyUnitRepository companyUnitRepository) {
        this.companyUnitRepository = companyUnitRepository;
    }

    public List<CompanyUnit> getAll(){
        return companyUnitRepository.findAll ();
    }

    public CompanyUnit getById(Long id){
        return companyUnitRepository.findById (  id).orElse ( null );
    }

    public CompanyUnit create(CompanyUnit companyUnit){
        return companyUnitRepository.save ( companyUnit );
    }

    public CompanyUnit update(CompanyUnit companyUnit){
        return companyUnitRepository.save ( companyUnit );
    }

    public void delete(Long id){
        companyUnitRepository.deleteById ( id );
    }

}
