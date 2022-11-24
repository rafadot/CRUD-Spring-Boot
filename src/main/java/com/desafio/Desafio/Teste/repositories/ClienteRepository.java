package com.desafio.Desafio.Teste.repositories;

import com.desafio.Desafio.Teste.model.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

    public Iterable<Cliente> findByNomeContainingIgnoreCase(String nome);

}
