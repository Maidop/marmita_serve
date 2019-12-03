package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Comida;
import com.marmitex.service.ComidaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("comida")
public class ComidaController extends CrudRestController<Comida, Long> {

    private  ComidaService comidaService;

    public ComidaController(ComidaService comidaService) {
        this.comidaService = comidaService;
    }

    @Override
    public CrudService<Comida, Long> getService() {
        return comidaService;
    }
}
