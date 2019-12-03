package com.marmitex.controller;

import com.marmitex.service.CardapioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cardapio")
public class CardapioController {

    private CardapioService cardapioService;

}
