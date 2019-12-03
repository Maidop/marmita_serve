package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Ingrediente;
import com.marmitex.service.IngredienteService;

public class IngredienteController extends CrudRestController<Ingrediente, Long> {

    private final IngredienteService ingredienteService;

    public IngredienteController(IngredienteService ingredienteService) {
        this.ingredienteService = ingredienteService;
    }

    @Override
    public CrudService<Ingrediente, Long> getService() {
        return ingredienteService;
    }
}
