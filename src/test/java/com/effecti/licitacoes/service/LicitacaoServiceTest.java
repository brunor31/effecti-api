package com.effecti.licitacoes.service;

import com.effecti.licitacoes.domain.Licitacao;
import com.effecti.licitacoes.repository.LicitacaoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class LicitacaoServiceTest {

    @Mock
    private LicitacaoRepository licitacaoRepository;

    @InjectMocks
    private LicitacaoService licitacaoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findAll() {
        List<Licitacao> licitacoes = new ArrayList<>();
        when(licitacaoRepository.findAll()).thenReturn(licitacoes);
        assertNotNull(licitacoes);
    }
}
