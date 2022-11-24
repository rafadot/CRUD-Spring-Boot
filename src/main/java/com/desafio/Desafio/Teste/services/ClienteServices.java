package com.desafio.Desafio.Teste.services;

import com.desafio.Desafio.Teste.dto.GetDto;
import com.desafio.Desafio.Teste.model.entities.Cliente;
import com.desafio.Desafio.Teste.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    public GetDto findById(UUID id){
        Cliente cliente = clienteRepository.findById(id).get();

        GetDto getDto = new GetDto(cliente);

        return getDto;

    }

    /*public GetDto findByNome(String nome){
        Cliente cliente = (Cliente) clienteRepository.findByNomeContainingIgnoreCase(nome);

        GetDto getDto = new GetDto(cliente);

        return getDto;
    }*/

}
