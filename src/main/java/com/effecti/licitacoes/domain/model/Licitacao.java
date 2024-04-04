package com.effecti.licitacoes.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Licitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String objeto;
    private String modalidade;
    private LocalDateTime dataPublicacao;
    private LocalDateTime dataInicialProposta;
    private LocalDateTime dataFinalProposta;
    private String url;
    private String portal;
    private Integer uasg;
    private String unidadeGestora;
    private Boolean srp;
    private String uf;
    private String processo;
    private Boolean favorito;
    private String perfilNome;
    private String orgao;
    @OneToMany(mappedBy = "licitacao")
    private List<ItemEdital> itens;
    @OneToMany(mappedBy = "licitacao")
    private List<Anexo> anexos;

}
