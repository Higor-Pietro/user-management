package com.higor.cadastrousuarios.service;

import org.springframework.stereotype.Service;

import com.higor.cadastrousuarios.repository.UserRepository;

@Service 
public class UserService {

    private UserRepository userRepository;

    public UserService (UserRepository repository){
        this.userRepository = repository;
    }



}
