package com.higor.cadastrousuarios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higor.cadastrousuarios.Dto.UserRequestDto;
import com.higor.cadastrousuarios.service.UserService;

@RestController 
@RequestMapping("/user")
public class UserController {

    private final  UserService userService;

    public UserController(UserService service){
            this.userService = service;
    }


    @GetMapping 
    public void carregarPagina(){

    }

    @PostMapping 
    public void cadastrarUsuario (@RequestBody UserRequestDto dto){    
        return userService.cadastrar(dto);
    }
}
