package com.marmitex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TAMANHOS")
public class Marmita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "PESO_MARMITA")
    private Double peso;

    @Column(name = "INATIVO")
    private boolean inativo = false;
}
