# Sistema de Vendas com JDBC e PostgreSQL

Projeto desenvolvido em Java com implementação completa de CRUD para as entidades **Cliente** e **Produto**, utilizando **JDBC** para integração com banco de dados **PostgreSQL**.

O objetivo do projeto é aplicar conceitos de persistência em banco relacional, arquitetura em camadas e boas práticas no acesso a dados.

---

## Tecnologias Utilizadas

- Java
- JDBC
- PostgreSQL
- SQL
- Programação Orientada a Objetos (POO)
- Padrão DAO

---

## Funcionalidades

### Cliente
- Cadastrar cliente
- Buscar cliente por ID
- Atualizar cliente
- Excluir cliente
- Listar clientes

### Produto
- Cadastrar produto
- Buscar produto por ID
- Atualizar produto
- Excluir produto
- Listar produtos

---

##️ Arquitetura do Projeto

O projeto foi estruturado utilizando o padrão **DAO (Data Access Object)**, separando claramente as responsabilidades:

### - Domain
Responsável pelas entidades do sistema.

### - DAO
Responsável pelo acesso e manipulação dos dados no banco.

### - ConnectionFactory
Centraliza a criação das conexões com o banco de dados.

---

## Segurança

- Utilização de **PreparedStatement** para evitar SQL Injection
- Separação de responsabilidades para melhor manutenção

---

##️ Banco de Dados

O projeto utiliza **PostgreSQL**.
