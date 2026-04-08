# Documentação do Projeto

[![Java CI Development with Gradle](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/actions/workflows/gradle-dev.yml/badge.svg)](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/actions/workflows/gradle-dev.yml)
[![Java CI Production with Gradle](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/actions/workflows/gradle-production.yml/badge.svg)](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/actions/workflows/gradle-production.yml)

### Deployments do back-end (utilizando Railway e GitHub):

- Links para os deployments de:
    - [Production](https://railway.com/project/cbab6fb6-bce4-439a-9689-46d5348a25d9?environmentId=2b5d75d2-53cf-4e9a-bc84-9f8738ee9d0d) (produção)
    - [Dev](https://railway.com/project/cbab6fb6-bce4-439a-9689-46d5348a25d9?environmentId=112ca1c4-cea4-44e5-8fc3-e94aa91e8a93) (desenvolvimento e testes)

### Arquitetura final do sistema:

O projeto foi iniciado com um repositório do back-end no TP1.
Depois, foi adicionado um front-end em um novo repositório no TP2. No TP3, um novo projeto foi adicionado (conectado pelo mesmo back-end do anterior).
Para o TP4 e TP5, automatizações de ponta foram criadas para o ciclo CI/CD da aplicação como um todo.

Com a ajuda de git submodules, todas as peças do Projeto de Bloco estão conectadas
e podem ser observadas ao analisar a estrutura dos repositórios no GitHub.

### Configuração e funcionamento dos workflows no GitHub Actions:

O back-end possui, quase por completo, a lógica dos workflows. Nele, testes dentro do build gradle são realizados.
Após isso, o back-end vai para o deploy em Railway. No final, a aplicação é analisada e testada dinamicamente pelo ZAP.
Por fim, o deploy do front-end também é realizado, acionado pelo back-end. Com isso, é possível testar a funcionalidade do sistema com o Selenium.

### Descrição dos ambientes de deploy e suas proteções:

O ambiente de deploy não pode ser mergido sem a aprovação de um membro do repositório.
Além disso, é obrigatório o escaneamento do código estático através do CodeQL. Se houver erros, o código não poderá ser mergido. 

### Explicação das estratégias de testes aplicadas, incluindo pós-deploy:

Durante o projeto, foram utilizados testes unitários (com Mockito para mockar o banco de dados em desenvolvimento, Jqwik para testes baseados em propriedade, etc.).
Também selenium para testes de funcionalidade envolvendo interface gráfica. Testes SAST CodeQL. Testes DAST com ZAP pós-deploy.

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

### Cobertura de Testes:

<b>Objetivo: 100% em Service (regras de negócio e lógica - alcançado. Entity, com 87%, é apenas a modelagem de Conta). 80% geral (alcançado).</b>

![Cobertura JaCoCo](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/blob/main/jacoco_coverage.jpg?raw=true)

### Gráfico de Causa e Efeito do Saldo:

![Gráfico de Causa e Efeito do Saldo](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/blob/main/grafico_causa_efeito_saldo.jpg?raw=true)

### Tabela de Decisão do Saldo:

![Tabela de Decisão do Saldo](https://github.com/5TheLoneWolf5/EDDS_PB_TP1/blob/main/tabela_decisao_saldo.jpg?raw=true)

#### Scanners de Código
SAST ➡ CodeQL<br/>
DAST ➡ ZAP

##### Observação:
A ferramente de deploy Railway suporta e usa OIDC.