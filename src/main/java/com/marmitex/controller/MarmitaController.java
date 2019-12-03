package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Marmita;
import com.marmitex.service.MarmitaService;

public class MarmitaController extends CrudRestController<Marmita, Long> {

    private final MarmitaService marmitaService;

    public MarmitaController(MarmitaService marmitaService) {
        this.marmitaService = marmitaService;
    }

    @Override
    public CrudService<Marmita, Long> getService() {
        return marmitaService;
    }
}
