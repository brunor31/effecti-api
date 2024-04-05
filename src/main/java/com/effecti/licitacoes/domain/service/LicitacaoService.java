package com.effecti.licitacoes.domain.service;

import com.effecti.licitacoes.domain.model.Licitacao;
import com.effecti.licitacoes.domain.repository.LicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicitacaoService {

    @Autowired
    private LicitacaoRepository licitacaoRepository;

    public List<Licitacao> findAll() {
        return licitacaoRepository.findAll();
    }
}
