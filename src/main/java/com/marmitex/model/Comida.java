package com.marmitex.model;

import javax.persistence.*;

//@Entity
public class Comida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "COMIDA", nullable = false)
    private String comida;

    @Column(name = "INGREDIENTE")
    private Ingrediente ingrediente;

    @Column(name = "INATIVO")
    private String inativo;
}
