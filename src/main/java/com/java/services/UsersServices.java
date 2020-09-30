package com.java.services;

import com.java.model.Users;
import com.java.repository.UsersRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServices {

    private final UsersRepository usersRepository;

    public UsersServices(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getAll(){
        return usersRepository.findAll ();
    }

    public Users getById(Long id){
        return usersRepository.findById ( id).orElse ( null );
    }

    public Users create(Users users){
        return usersRepository.save ( users );
    }

    public Users update(Users users){
        return usersRepository.save ( users );
    }

    public void delete(Long id){
        usersRepository.deleteById ( id );
    }
}
