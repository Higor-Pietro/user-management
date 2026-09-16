package com.higor.cadastrousuarios.service;

import org.springframework.stereotype.Service;

import com.higor.cadastrousuarios.Dto.UserRequestDto;
import com.higor.cadastrousuarios.Dto.UserResponseDto;
import com.higor.cadastrousuarios.model.User;
import com.higor.cadastrousuarios.repository.UserRepository;

@Service 
public class UserService {

    private UserRepository userRepository;

    public UserService (UserRepository repository){
        this.userRepository = repository;
    }
 public UserResponseDto cadastrar(UserRequestDto dto) {

        User user = new User();

        user.setNome(dto.nome());
        user.setEmail(dto.email());
        user.setSenha(dto.senha());

       UserResponseDto userResponseDto = new UserResponseDto(dto.nome(), dto.email());
        
        userRepository.save(user);
        
        return userResponseDto;
       


    }
}
