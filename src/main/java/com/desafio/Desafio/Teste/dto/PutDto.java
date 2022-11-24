package com.desafio.Desafio.Teste.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutDto {

    @NotBlank
    private UUID id;

    @NotBlank
    private String nome;

    @NotBlank
    private String cidade;

    @NotBlank
    private String cpf;

    @NotBlank
    private String senha;


}
