package com.marmitex.model;

import javax.persistence.Entity;

@Entity
public class Comida {
    Código da Comida: Campo not null – tipo Integer – Campo sequencial único.
            Comida – Campo not null – tipo Varchar – tamanho 100.
    Ingredientes: Campo obrigatório – tipo Lista. Será realizado a busca e vinculo no cadastro de ingredientes, podem selecionar quantos forem necessários.
    Tipo de Comida: Campo obrigatório – tipo Lista. Será realizado a busca e vinculo no cadastro de ingredientes, podem selecionar quantos forem necessários.
    Inativo – Campo desmarcado por default – tipo checkbox.

    private Integer id;
    private String comida;
    private Ingrediente ingredientes;
    private String comida;
    private String comida;
}
