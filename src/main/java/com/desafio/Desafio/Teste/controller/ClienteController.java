package com.desafio.Desafio.Teste.controller;

import com.desafio.Desafio.Teste.dto.GetDto;
import com.desafio.Desafio.Teste.dto.PostDto;
import com.desafio.Desafio.Teste.dto.PutDto;
import com.desafio.Desafio.Teste.model.entities.Cliente;
import com.desafio.Desafio.Teste.repositories.ClienteRepository;
import com.desafio.Desafio.Teste.services.ClienteServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*",maxAge = 3600)
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ClienteServices clienteServices;

    @PostMapping
    public Cliente novoCliente(@Valid PostDto postDto){
        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(postDto,cliente);

        return clienteRepository.save(cliente);
    }

    @GetMapping
    public Iterable<Cliente> verClientes(){
        return clienteRepository.findAll();
    }

    /*@GetMapping(path = "/{id}")
    Optional<Cliente> clientePorId(@PathVariable UUID id){
        return clienteRepository.findById(id);
    }*/

    @GetMapping(path = "/id/{id}")
    public GetDto buscaId(@PathVariable UUID id){
        return clienteServices.findById(id);
    }

    @GetMapping(path = "/nome/{nome}")
    public Iterable<Cliente> buscaPornome(@PathVariable String nome){
        return clienteRepository.findByNomeContainingIgnoreCase(nome);
    }


    @PutMapping
    public Cliente alterarCliente(PutDto putDto){
        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(putDto,cliente);
        return clienteRepository.save(cliente);
    }

    //teste unindo branch

    @DeleteMapping(path = "/{id}")
    public void deletaCliente(@PathVariable UUID id){
        clienteRepository.deleteById(id);
    }

    //testeGit
}
