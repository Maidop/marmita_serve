package com.marmitex.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "COMIDA_TIPO")
public class TipoComida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_COMIDA", nullable = false)
    private Comida comida;

    @Column(name = "ID_TIPO", nullable = false)
    private Tipo tipo;
}
