package com.effecti.licitacoes.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class ItemEdital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @ManyToOne
    @JoinColumn(name = "idLicitacao")
    private Licitacao licitacao;
    private Integer item;
    private String lote;
    private String diferenciado;
    private String produtoLicitado;
    private String unidade;
    private Long quantidade;
    private Integer decreto7174;
}
