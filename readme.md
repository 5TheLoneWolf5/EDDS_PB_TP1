# Documentação do Projeto

[![Java CI with Gradle](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/actions/workflows/gradle.yml/badge.svg)](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/actions/workflows/gradle.yml)

### Deployments do back-end (utilizando Railway e GitHub):

- Links para deployments de:
    - [Production](https://railway.com/project/cbab6fb6-bce4-439a-9689-46d5348a25d9/settings?environmentId=2b5d75d2-53cf-4e9a-bc84-9f8738ee9d0d) (produção)
    - [Dev](https://railway.com/project/cbab6fb6-bce4-439a-9689-46d5348a25d9/settings?environmentId=112ca1c4-cea4-44e5-8fc3-e94aa91e8a93) (desenvolvimento e testes)

### Especificação:

Esta é a aplicação de um banco fictício, que contém um CRUD feito em Java com Spring Boot e outras tecnologias. A seguir são os comportamentos esperados do software:

C -> Adicionar nova conta dentro do banco de dados do banco.<br/>
R -> Obter dados de uma ou várias contas.<br/>
U -> Editar saldo de uma conta já existente.<br/>
R -> Remover uma conta via ID.<br/>

### Tecnologias:

- Projeto feito com Maven;
- Spring Boot framework;
- JUnit para testes unitários;
- JaCoCo utilizado para a cobertura dos testes unitários;
- Mockito para mocks das consultas ao banco;
- MySQL para a persistência dos dados;
- Lombok para automação de código boilerplate.

### Cobertura de testes:
#### Objetivo: 80% (alcançado).

![Cobertura JaCoCo](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/blob/main/jacoco_coverage.jpg?raw=true)

### Gráfico de Causa e Efeito do Saldo:

![Gráfico de Causa e Efeito do Saldo](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/blob/main/grafico_causa_efeito_saldo.jpg?raw=true)

### Tabela de Decisão do Saldo:

![Tabela de Decisão do Saldo](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/blob/main/tabela_decisao_saldo.jpg?raw=true)

#### Scanners de Código
SAST ➡ CodeQL<br/>
DAST ➡ Workflow