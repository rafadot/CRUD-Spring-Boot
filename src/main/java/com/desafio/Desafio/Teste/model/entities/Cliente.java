package com.desafio.Desafio.Teste.model.entities;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "DB_CLIENTES")
public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String nome;
    @Column
    private String cidade;
    @Column
    private String cpf;
    @Column
    private String senha;


}
