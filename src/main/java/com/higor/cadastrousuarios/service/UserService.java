package com.higor.cadastrousuarios.service;

import org.springframework.stereotype.Service;

import com.higor.cadastrousuarios.Dto.UserRequestDto;
import com.higor.cadastrousuarios.model.User;
import com.higor.cadastrousuarios.repository.UserRepository;

@Service 
public class UserService {

    private UserRepository userRepository;

    public UserService (UserRepository repository){
        this.userRepository = repository;
    }
 public User cadastrar(UserRequestDto dto) {

        User user = new User();

        user.setNome(dto.nome());
        user.setEmail(dto.email());
        user.setSenha(dto.senha());

        return userRepository.save(user);


    }
}
