package com.effecti.licitacoes.service;

import com.effecti.licitacoes.domain.Licitacao;
import com.effecti.licitacoes.repository.LicitacaoRepository;
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
