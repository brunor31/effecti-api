package com.effecti.licitacoes.api.controller;

import com.effecti.licitacoes.domain.Licitacao;
import com.effecti.licitacoes.service.LicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/licitacao")
public class LicitacaoController {

    @Autowired
    private LicitacaoService licitacaoService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Licitacao> findAll() {
        return licitacaoService.findAll();
    }
}
