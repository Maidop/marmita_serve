package com.marmitex.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id ;

    @Column(name = "DATA")
    private Date data;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;
}
