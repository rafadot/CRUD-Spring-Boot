package com.desafio.Desafio.Teste.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    @NotBlank
    private String nome;

    @NotBlank
    private String cidade;

    @NotBlank
    @Size(max = 14, min = 14)
    private String cpf;

    @NotBlank
    @Size(min = 6)
    private String senha;


}
