package com.marmitex.model;

import javax.persistence.*;

@Entity
@Table(name = "COMIDA_TIPO")
public class TipoComida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_COMIDA", nullable = false)
    private Comida id_comida;

    @Column(name = "ID_TIPO", nullable = false)
    private Tipo id_tipo;
}
