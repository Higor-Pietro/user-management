package com.higor.cadastrousuarios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higor.cadastrousuarios.Dto.UserRequestDto;
import com.higor.cadastrousuarios.Dto.UserResponseDto;
import com.higor.cadastrousuarios.service.UserService;

@RestController 
@RequestMapping("/user")
public class UserController {

    private final  UserService userService;

    public UserController(UserService service){
            this.userService = service;
    }


    @GetMapping 
    public List<UserResponseDto> carregarPagina (){

        return userService.listar();
    }

    @PostMapping 
    public UserResponseDto cadastrarUsuario (@RequestBody UserRequestDto dto){    
        return userService.cadastrar(dto);
    }

    @DeleteMapping 
    public UserResponseDto deletarUsuario (@RequestBody UserRequestDto dto){
        return userService.removerUser(dto);
    }
}
