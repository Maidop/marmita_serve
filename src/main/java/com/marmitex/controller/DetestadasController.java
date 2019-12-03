package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Comida;
import com.marmitex.model.Detestada;

public class DetestadasController<DetestadaService> extends CrudRestController<Detestada, Long> {

    private final DetestadaService detestadaService;

    public DetestadasController(DetestadaService detestadaService) {
        this.detestadaService = detestadaService;
    }

    @Override
    public CrudService<Comida, Long> getService() {
        return detestadaService;
    }


}
