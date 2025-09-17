# Projeto GamesList - Intensivão Java Spring

## 🎮 Sobre o Projeto

O **GamesList** é uma aplicação **back-end em Java + Spring Boot**.  
Seu objetivo é fornecer uma **API REST** para gerenciar coleções de jogos, permitindo operações como **visualizar, ordenar e mover jogos em listas personalizadas**.

Projeto desenvolvido no Intensivão Java Spring com o professor [Nélio Alves](https://github.com/acenelio).
## Modelo de domínio GamesList

![Modelo de domínio DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)
## 🧱 Arquitetura

A aplicação segue uma arquitetura em camadas, facilitando a manutenção e escalabilidade:

- **Controller**: Responsável por receber e processar as requisições HTTP.
- **Service**: Contém a lógica de negócios da aplicação.
- **Repository**: Interface entre a aplicação e o banco de dados, utilizando Spring Data JPA.
- **DTO (Data Transfer Object)**: Objetos utilizados para transferir dados entre as camadas, promovendo desacoplamento e segurança.

## 🛠 Tecnologias Utilizadas
[![Java](https://img.shields.io/badge/Java-21-007396?logo=java&logoColor=white)](https://www.oracle.com/java/) 
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen?logo=springboot)](https://spring.io/projects/spring-boot)

[![H2 Database](https://img.shields.io/badge/H2%20Database-1.4.200-17BEBB?logo=h2database&logoColor=white)](https://www.h2database.com/html/main.html)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-4169E1?logo=postgresql&logoColor=white)](https://www.postgresql.org/)

[![Docker Compose](https://img.shields.io/badge/Docker%20Compose-ready-blue?logo=docker&logoColor=white)](https://docs.docker.com/compose/)
[![Deploy Railway](https://img.shields.io/badge/Deploy-Railway-0B0D0E?logo=railway)](https://gameslist-production-adb2.up.railway.app/games)

[![JUnit 5](https://img.shields.io/badge/JUnit%205-5.7.0-25A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-yellow?logo=swagger&logoColor=white)](https://swagger.io/specification/)

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](LICENSE)

- **Java 21**: Linguagem principal do projeto.
- **Spring Boot 3**: Framework para desenvolvimento de aplicações back-end.
- **Spring Data JPA**: Para interação com o banco de dados.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **PostgreSQL**: Banco de dados utilizado em produção.
- **Swagger/OpenAPI**: Documentação interativa da API.
- **Lombok**: Redução de boilerplate code.
- **Railway**: Plataforma de deploy e hospedagem.
- **Maven**: Gerenciador de dependências e build.
- **JUnit 5**: Framework para testes unitários.

## 🚀 Como Executar o Projeto
### 1️⃣ Pré-requisitos
- JDK 17 ou superior
- Maven 3.8+
- Docker e Docker Compose (para execução do banco local)

### 2️⃣ Execução Local com Docker Compose
1. Certifique-se de ter o arquivo [`docker-compose.yml`](docker-compose.yml) na raiz do projeto.
2. Suba os containers:

```bash
docker-compose up -d
```
### 3️⃣ Clone e compile o projeto:

1. Clone o repositório:

   ```bash
   git clone https://github.com/Andretsaalmeida/gamesList.git
   cd gamesList
2. Compile o projeto:

   ```bash
   mvn clean install
   ```
3. Execute a aplicação:

   ```bash
    mvn spring-boot:run
    ```
   
4. A documentação da API pode ser acessada em `http://localhost:8080/swagger-ui.html`.

5. Scripts de Banco de Dados

Scripts SQL para criação e popularção do banco de dados estão localizados em:

- src/main/resources/db/create.sql: Criação das tabelas.

- src/main/resources/db/insert.sql: Inserção de dados iniciais.

## 🌐 Acesso à Aplicação

- **Localmente**: [http://localhost:8080](http://localhost:8080)
- **Deploy na Railway**: 👉 [https://gameslist-production-adb2.up.railway.app/games](https://gameslist-production-adb2.up.railway.app/games)


## 🧪 Testes com Postman

Uma coleção pronta está disponível em:

📁 [GamesList.postman_collection.json](/GamesList.postman_collection.json)

## 📂 Estrutura do Projeto

```bash
gamesList/
├── LICENSE
├── README.md
├── pom.xml
├── system.properties
├── GamesList.postman_collection.json
├── .gitignore
├── docker-compose.yml
├── src
│   ├── main
│   │   ├── java/com/andretsaalmeida/gamelist
│   │   │   ├── config
│   │   │   ├── controller
│   │   │   ├── dto
│   │   │   ├── entities
│   │   │   ├── projections
│   │   │   ├── repository
│   │   │   ├── service
│   │   │   └── GameListApplication.java
│   │   └── resources
│   │       ├── db/create.sql
│   │       ├── META-INF/additional-spring-configuration-metadata.json
│   │       ├── application.properties
│   │       ├── application-dev.properties
│   │       ├── application-prod.properties
│   │       └── application-test.properties
│   └── test/java/com/andretsaalmeida/gamelist
│       └── ExampleTest.java

```
🤝 Contribuição

Contribuições são bem-vindas! Para colaborar:

1. Faça um fork do projeto

2. Crie uma branch para sua feature (git checkout -b minha-feature)

3. Commit suas alterações (git commit -m 'feat: adiciona minha feature')

4. Envie sua branch (git push origin minha-feature)

5. Abra um Pull Request 🚀

📄 Licença

Este projeto está licenciado sob a Licença GPL-3.0. [LICENSE](LICENSE) →