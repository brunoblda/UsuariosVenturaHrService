# Infnet - PB - Projeto de Bloco Java
Teste de Performance 7 da matéria de Projeto de Bloco

REST API do VenturaHr referente aos usuário.

## Apresentação

No Teste de Performance 7, você vai colocar em prática as seguintes habilidades desenvolvidas durante a etapa 7:

- Compreender a função da camada controladora em aplicações Web
- Compreender o ciclo de vida dos servlets
- Recuperar informações das requisições em Servlets
- Escrever conteúdo dinâmico em aplicações com Servlets

Você deve dar continuidade ao processo de construção do seu sistema, iniciado no TP5.

Com base no documento que contém os requisitos e a modelagem do sistema, você está pronto para começar a construção da aplicação Web. Comece pelas entidades controladoras do seu sistema, que serão construídas como Servlets. Construa em cada Servlet o máximo que conseguir sobre cada funcionalidade do sistema. Crie a interação com o usuário do sistema no próprio Servlet ou através de formulários HTML, e simule gravações ou consultas ao banco de dados quando necessário. Não se preocupe, nos próximos TPs você vai construir as outras camadas do sistema e essas funções sairão dos seus Servlets.

## Desenvolvimento

Este repositório trata-se do microservice REST API da aplicação VenturaHR.

Este back-end esta sendo desenvolvido em Spring boot.

Este microservice esta sendo desenvolvido para realizar as funcionalidades referentes aos usuários.

### Teste de Perfomance 7 - TP7

Nesta etapa foi desenvolvida a persitência de dados utilizando o HashMap na camada de repositório.

É realizada a comunicação com o Front-end, recebendo as informações de cadastro via http (json) e inserindo-as no HashMap do repository.

