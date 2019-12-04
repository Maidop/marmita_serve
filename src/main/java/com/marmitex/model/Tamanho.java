package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TAMANHOS")
public class Tamanho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    private Long id;

    @Column(name = "PESO_MARMITA")
    private Double peso;

    @Column(name = "INATIVO")
    private boolean inativo = false;
}
