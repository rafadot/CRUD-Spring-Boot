package com.desafio.Desafio.Teste.dto;


import com.desafio.Desafio.Teste.model.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetDto {

    private UUID id;
    private String nome;

    private String cidade;

    private String cpf;

    public GetDto(Cliente cliente){
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.cidade = cliente.getCidade();
        this.cpf = cliente.getCpf();
    }

}
