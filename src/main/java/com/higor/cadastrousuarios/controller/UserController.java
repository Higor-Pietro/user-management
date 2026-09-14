package com.higor.cadastrousuarios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higor.cadastrousuarios.service.UserService;

@RestController 
@RequestMapping("/user")
public class UserController {

    public final UserService userService = new UserService();

    @GetMapping 
    public void carregarPagina(){

    }
}
