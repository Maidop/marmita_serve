package com.marmitex.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RelatorioMaisPedido {
    private Integer numeroClientes;
    private Double percentualClientesPedintes;
    private String nomeCardapio;
    private Long idCardapio;
    private List<String> comidaList = new ArrayList<>();
}
