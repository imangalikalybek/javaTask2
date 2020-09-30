package com.java.services;

import com.java.model.Company;
import com.java.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServices {

    private final CompanyRepository companyRepository;

    public CompanyServices(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAll(){
        return companyRepository.findAll ();
    }

    public Company getById(Long id){
        return companyRepository.findById ( id ).orElse ( null );
    }

    public Company create(Company company){
        return companyRepository.save ( company );
    }

    public Company update(Company company){
        return companyRepository.save ( company );
    }

    public void delete(Long id){
        companyRepository.deleteById ( id );
    }
}
