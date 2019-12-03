package com.marmitex.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TIPO")
public class TipoComida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TIPO_COMIDA", length = 100, nullable = false)
    private String tipoComida;

    @Column(name = "INATIVO")
    private boolean inativo = false;
}
