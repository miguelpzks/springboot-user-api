# API de Gerenciamento de Usuários

Esta é uma API RESTful desenvolvida em **Java 21** com **Spring Boot 3**, utilizando **JPA (Hibernate)** e banco de dados em memória **H2**, para operações básicas de CRUD (Create, Read, Update, Delete) de usuários.

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4
- Spring Data JPA
- H2 Database (em memória)
- Postman (para testes)

## 📦 Endpoints Disponíveis

### ✅ Criar um novo usuário
`POST /usuarios`

**JSON exemplo:**
```json
{
  "nome": "Miguel",
  "email": "miguel@email.com"
}
```
📋 Listar todos os usuários
GET /usuarios

🔍 Buscar usuário por ID
GET /usuarios/{id}

✏️ Atualizar usuário existente
PUT /usuarios/{id}

JSON exemplo:
```json
{
  "nome": "Miguel Atualizado",
  "email": "miguel.novo@email.com"
}
```
❌ Deletar usuário
DELETE /usuarios/{id}

💻 Como rodar o projeto localmente
1. Clone o repositório:
git clone https://github.com/SEU_USUARIO/springboot-user-api.git

2. Entre na pasta:
cd springboot-user-api

3. Rode o projeto:
./mvnw spring-boot:run

Acesse a API em: http://localhost:8080

🔎 H2 Console (Banco de Dados em Memória)
URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:usuariosdb

Usuário: sa

Senha: (deixe em branco)

🧠 Autor
Desenvolvido por Miguel como parte do plano de aprendizado profissional em Java.

📄 Licença
Este projeto está sob a licença MIT.
