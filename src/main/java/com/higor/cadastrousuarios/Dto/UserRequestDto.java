package com.higor.cadastrousuarios.Dto;

import lombok.Getter;

public record UserRequestDto(
    String nome,
    String email,
    String senha
) 
{}
