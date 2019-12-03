package com.marmitex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Comida {
    @Id
    @GeneratedValue()
    private Integer id;

    @Column(name = "COMIDA", nullable = false)
    private String comida;

    @Column(name = "INGREDIENTE")
    private Ingrediente ingrediente;

    @Column(name = "TIPO_COMIDA")
    private String tipoComida;

    @Column(name = "STATUS_COMIDA")
    private String inativo;
}
