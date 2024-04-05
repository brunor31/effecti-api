package com.effecti.licitacoes.domain.repository;

import com.effecti.licitacoes.domain.model.Licitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicitacaoRepository extends JpaRepository<Licitacao, Long> {
}
