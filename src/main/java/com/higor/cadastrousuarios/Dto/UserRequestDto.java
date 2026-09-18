package com.higor.cadastrousuarios.Dto;


public record UserRequestDto(

    Long id,
    String nome,
    String email,
    String senha
) 
{}
