DROP TABLE T_TKN_CONQUISTA;
DROP TABLE T_TKN_SESSAO_GINASTICA_EXERCICIO;
DROP TABLE T_TKN_DESEMPENHO;
DROP TABLE T_TKN_SESSAO_GINASTICA;
DROP TABLE T_TKN_EXERCICIO;
DROP TABLE T_TKN_TIPO_EXERCICIO;
DROP TABLE T_TKN_HISTORICO_SAUDE;
DROP TABLE T_TKN_PROFISSAO;
DROP TABLE T_TKN_CHATBOT;
DROP TABLE T_TKN_USUARIO;
DROP TABLE T_TKN_DESAFIO;
DROP TABLE T_TKN_EQUIPE;

CREATE TABLE T_TKN_EQUIPE (
    id_equipe INTEGER PRIMARY KEY,
    nm_equipe VARCHAR(70) NOT NULL,
    dt_formacao DATE NOT NULL,
    nr_total_membros INTEGER NOT NULL,
    nr_pontuacao INTEGER NOT NULL,
    ds_objetivo_equipe VARCHAR(100) NOT NULL
);

CREATE TABLE T_TKN_DESAFIO (
    id_desafio INTEGER PRIMARY KEY,
    nm_desafio VARCHAR(100) NOT NULL,
    ds_desafio VARCHAR(200) NOT NULL,
    nr_nivel_dificuldade INTEGER NOT NULL,
    dt_inicio DATE NOT NULL,
    dt_fim DATE NOT NULL
);

CREATE TABLE T_TKN_USUARIO (
    id_usuario INTEGER PRIMARY KEY,
    nm_usuario VARCHAR(100) NOT NULL,
    ds_email VARCHAR(100) NOT NULL UNIQUE,
    ds_senha VARCHAR(100) NOT NULL,
    dt_nascimento DATE NOT NULL,
    nr_altura NUMERIC(3,2) NOT NULL,
    nr_peso NUMERIC (5,2) NOT NULL,
    ds_sexo VARCHAR(2) CHECK (ds_sexo IN ('F', 'M')) NOT NULL,
    id_equipe INTEGER REFERENCES T_TKN_EQUIPE(id_equipe)
);

CREATE TABLE T_TKN_CHATBOT (
    id_chatbot INTEGER PRIMARY KEY,
    tx_entrada VARCHAR(500) NOT NULL,
    tx_saida VARCHAR(500) NOT NULL,
    dt_mensagem DATE NOT NULL,
    ds_intencao VARCHAR(100) NOT NULL,
    id_usuario REFERENCES T_TKN_USUARIO(id_usuario) NOT NULL
);

CREATE TABLE T_TKN_PROFISSAO (
    id_profissao INTEGER PRIMARY KEY,
    ds_profissao VARCHAR(100) NOT NULL,
    ds_nivel_atividade_fisica VARCHAR(50) NOT NULL,
    ds_estresse_ocupacional VARCHAR(30) NOT NULL,
    nr_frequencia_pausa_ativa DECIMAL(3,2) NOT NULL,
    id_usuario REFERENCES T_TKN_USUARIO(id_usuario) NOT NULL
);

CREATE TABLE T_TKN_HISTORICO_SAUDE (
    id_historico_saude INTEGER PRIMARY KEY,
    dt_registro DATE NOT NULL,
    ds_estresse VARCHAR(20) NOT NULL,
    ds_postura VARCHAR(100) NOT NULL,
    nr_horas_sedentarias DECIMAL(3,2) NOT NULL,
    ds_lesoes VARCHAR(200) NOT NULL,
    id_usuario REFERENCES T_TKN_USUARIO(id_usuario) NOT NULL
);

CREATE TABLE T_TKN_TIPO_EXERCICIO (
    id_tipo_exercicio INTEGER PRIMARY KEY,
    nm_tipo_exercicio VARCHAR(70) NOT NULL,
    ds_tipo_exercicio VARCHAR(200) NOT NULL
);

CREATE TABLE T_TKN_EXERCICIO (
    id_exercicio INTEGER PRIMARY KEY,
    nm_exercicio VARCHAR(70) NOT NULL,
    ds_exercicio VARCHAR(200) NOT NULL,
    url_video_demonstracao VARCHAR(90) NOT NULL,
    ds_dificuldade VARCHAR(70) NOT NULL,
    nr_series_recomendado INTEGER NOT NULL,
    nr_repeticoes_recomendado INTEGER NOT NULL,
    ds_beneficios VARCHAR(100) NOT NULL,
    nr_tempo_execucao NUMERIC(4,2) NOT NULL,
    id_tipo_exercicio REFERENCES T_TKN_TIPO_EXERCICIO(id_tipo_exercicio) NOT NULL
);

CREATE TABLE T_TKN_SESSAO_GINASTICA (
    id_sessao_ginastica INTEGER PRIMARY KEY,
    dt_sessao DATE NOT NULL,
    nr_duracao NUMERIC(4,2) NOT NULL,
    id_usuario REFERENCES T_TKN_USUARIO(id_usuario) NOT NULL
);

CREATE TABLE T_TKN_DESEMPENHO (
    id_desempenho INTEGER PRIMARY KEY,
    ds_feedback VARCHAR(200) NOT NULL,
    nr_intensidade INTEGER NOT NULL,
    nr_nivel_flexibilidade INTEGER NOT NULL,
    nr_rendimento_geral INTEGER NOT NULL,
    id_sessao_ginastica INTEGER REFERENCES T_TKN_SESSAO_GINASTICA(id_sessao_ginastica) NOT NULL
);

CREATE TABLE T_TKN_SESSAO_GINASTICA_EXERCICIO (
    id_sessao_exercicio INTEGER PRIMARY KEY,
    id_exercicio INTEGER REFERENCES T_TKN_EXERCICIO(id_exercicio) NOT NULL,
    id_sessao_ginastica INTEGER REFERENCES T_TKN_SESSAO_GINASTICA(id_sessao_ginastica) NOT NULL
);

CREATE TABLE T_TKN_CONQUISTA (
    id_conquista INTEGER PRIMARY KEY,
    nr_pontuacao_conquista INTEGER NOT NULL,
    ds_conquista VARCHAR(100) NOT NULL,
    nm_conquista VARCHAR(100) NOT NULL,
    ds_tipo_conquista VARCHAR(50) NOT NULL,
    nr_progresso_atual DECIMAL(4,1) NOT NULL,
    id_desafio INTEGER REFERENCES T_TKN_DESAFIO(id_desafio) NOT NULL,
    id_sessao_ginastica INTEGER REFERENCES T_TKN_SESSAO_GINASTICA(id_sessao_ginastica) NOT NULL
);

INSERT INTO T_TKN_EQUIPE (id_equipe, nm_equipe, dt_formacao, nr_total_membros, nr_pontuacao, ds_objetivo_equipe)
VALUES (1, 'Equipe A', TO_DATE('2023-01-01', 'YYYY-MM-DD'), 5, 100, 'Objetivo da Equipe A');

INSERT INTO T_TKN_DESAFIO (id_desafio, nm_desafio, ds_desafio, nr_nivel_dificuldade, dt_inicio, dt_fim)
VALUES (1, 'Desafio 1', 'Descrição do Desafio 1', 2, TO_DATE('2023-02-01', 'YYYY-MM-DD'), TO_DATE('2023-02-28', 'YYYY-MM-DD'));

INSERT INTO T_TKN_USUARIO (id_usuario, nm_usuario, ds_email, ds_senha, dt_nascimento, nr_altura, nr_peso, ds_sexo, id_equipe)
VALUES (1, 'Usuario1', 'usuario1@email.com', 'senha123', TO_DATE('1990-01-01', 'YYYY-MM-DD'), 1.75, 70, 'M', 1);

INSERT INTO T_TKN_CHATBOT (id_chatbot, tx_entrada, tx_saida, dt_mensagem, ds_intencao, id_usuario)
VALUES (1, 'Oi', 'Olá! Como posso ajudar?', TO_DATE('2023-03-01', 'YYYY-MM-DD'), 'Saudacao', 1);

INSERT INTO T_TKN_PROFISSAO (id_profissao, ds_profissao, ds_nivel_atividade_fisica, ds_estresse_ocupacional, nr_frequencia_pausa_ativa, id_usuario)
VALUES (1, 'Profissao1', 'Ativo', 'Baixo', 0.5, 1);

INSERT INTO T_TKN_HISTORICO_SAUDE (id_historico_saude, dt_registro, ds_estresse, ds_postura, nr_horas_sedentarias, ds_lesoes, id_usuario)
VALUES (1, TO_DATE('2023-03-15', 'YYYY-MM-DD'), 'Baixo', 'Boa', 3, 'Nenhuma', 1);

INSERT INTO T_TKN_TIPO_EXERCICIO (id_tipo_exercicio, nm_tipo_exercicio, ds_tipo_exercicio)
VALUES (1, 'Cardio', 'Exercícios aeróbicos para melhorar a resistência');

INSERT INTO T_TKN_EXERCICIO (id_exercicio, nm_exercicio, ds_exercicio, url_video_demonstracao, ds_dificuldade, nr_series_recomendado, nr_repeticoes_recomendado, ds_beneficios, nr_tempo_execucao, id_tipo_exercicio)
VALUES (1, 'Corrida', 'Correr no lugar', 'https://www.example.com', 'Fácil', 3, 15, 'Melhora cardiovascular', 20, 1);

INSERT INTO T_TKN_SESSAO_GINASTICA (id_sessao_ginastica, dt_sessao, nr_duracao, id_usuario)
VALUES (1, TO_DATE('2023-03-20', 'YYYY-MM-DD'), 30, 1);

INSERT INTO T_TKN_DESEMPENHO (id_desempenho, ds_feedback, nr_intensidade, nr_nivel_flexibilidade, nr_rendimento_geral, id_sessao_ginastica)
VALUES (1, 'Bom desempenho!', 8, 7, 9, 1);

INSERT INTO T_TKN_CONQUISTA (id_conquista, nr_pontuacao_conquista, ds_conquista, nm_conquista, ds_tipo_conquista, nr_progresso_atual, id_desafio, id_sessao_ginastica)
VALUES (1, 50, 'Conquista 1', 'Conquista Realizada', 'Diária', 30.5, 1, 1);
