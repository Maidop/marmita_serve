package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Pessoa;
import com.marmitex.service.PessoaService;

public class PessoaController extends CrudRestController<Pessoa, Long> {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @Override
    public CrudService<Pessoa, Long> getService() {
        return pessoaService;
    }
}
