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

    @ManyToOne
    @JoinColumn(name = "ID_COMIDA", referencedColumnName = "id")
    private Comida comida;

    @OneToOne
    @JoinColumn(name = "ID_TIPO", referencedColumnName = "id")
    private Tipo tipo;
}
