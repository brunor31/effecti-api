create table licitacao (
                           favorito boolean,
                           srp boolean,
                           uasg integer,
                           data_final_proposta timestamp(6),
                           data_inicial_proposta timestamp(6),
                           data_publicacao timestamp(6),
                           id bigint not null primary key,
                           modalidade varchar(255),
                           objeto varchar(500),
                           orgao varchar(255),
                           perfil_nome varchar(255),
                           portal varchar(255),
                           processo varchar(255),
                           uf varchar(255),
                           unidade_gestora varchar(255),
                           url varchar(255)
);

create table anexo (
                       id bigserial not null primary key,
                       id_licitacao bigint,
                       nome varchar(255),
                       url varchar(255),
                       constraint fk_licitacao_id_licitacao foreign key (id_licitacao) references licitacao(id)
);

create table item_edital (
                             decreto7174 integer,
                             item integer,
                             id bigserial not null primary key,
                             id_licitacao bigint,
                             quantidade bigint,
                             diferenciado varchar(255),
                             lote varchar(255),
                             produto_licitado varchar(255),
                             unidade varchar(255),
                             constraint fk_licitacao_id_licitacao foreign key (id_licitacao) references licitacao(id)
);

create table palavra (
                         id bigserial not null primary key,
                         id_licitacao bigint,
                         descricao varchar(255),
                         constraint fk_licitacao_id_licitacao foreign key (id_licitacao) references licitacao(id)
);

create table usuario (
                         id bigserial not null primary key,
                         nome varchar(255),
                         email varchar(255) unique,
                         senha varchar(255)
);

