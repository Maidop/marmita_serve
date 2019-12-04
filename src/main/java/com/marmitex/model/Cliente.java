package com.marmitex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CLIENTES")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "ADMIN", nullable = false)
    private boolean admin;

    @Column(name = "CPF", nullable = false, length = 11)
    private String cpf;

    @Column(name = "TELEFONE", nullable = false, length = 11)
    private String telefone;

    @Column(name = "SENHA", nullable = false, length = 10)
    private String senha;

    @Column(name = "CEP", nullable = false, length = 8)
    private String cep;

    @Column(name = "LOGRADOURO", nullable = false, length = 100)
    private String logradouro;

    @Column(name = "NUMERO", nullable = false)
    private Integer numero;

    @Column(name = "BAIRRO", nullable = false, length = 100)
    private String bairro;

}
