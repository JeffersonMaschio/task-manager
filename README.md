# Spring Boot To-Do API

API REST simples para gerenciamento de tarefas, desenvolvida como projeto de estudo em Java + Spring Boot.

## Tecnologias

- Java 21
- Spring Boot 4
- Spring Data JPA
- PostgreSQL
- Bean Validation
- Springdoc OpenAPI (Swagger)

## Funcionalidades

- Criar, listar, buscar, atualizar e deletar tarefas (CRUD completo)
- Validação de dados de entrada
- Tratamento de erros HTTP (404, 400)
- Documentação interativa via Swagger

## Endpoints

| Método | Rota           | Descrição                  |
|--------|----------------|-----------------------------|
| POST   | /tarefas       | Cria uma nova tarefa        |
| GET    | /tarefas       | Lista todas as tarefas      |
| GET    | /tarefas/{id}  | Busca uma tarefa por ID     |
| PUT    | /tarefas/{id}  | Atualiza uma tarefa         |
| DELETE | /tarefas/{id}  | Remove uma tarefa           |

## Como rodar localmente

### Pré-requisitos
- Java 21+
- Maven
- PostgreSQL rodando localmente

### Configuração do banco

```sql
CREATE DATABASE tododb;
CREATE USER todouser WITH PASSWORD 'sua_senha';
GRANT ALL PRIVILEGES ON DATABASE tododb TO todouser;
GRANT ALL ON SCHEMA public TO todouser;
```

### Variáveis de ambiente (opcional)

```bash
export DB_USER=todouser
export DB_PASSWORD=sua_senha
```

### Rodando a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação sobe em `http://localhost:8080`.

## Documentação da API

Com a aplicação rodando, acesse:
http://localhost:8080/api-guide

## Exemplo de uso

```bash
curl -X POST http://localhost:8080/tarefas \
  -H "Content-Type: application/json" \
  -d '{"titulo": "Estudar Spring Boot", "concluida": false}'
```
