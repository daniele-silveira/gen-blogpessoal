# ✍️ Blog Pessoal

Projeto de uma API REST para gestão de blog pessoal desenvolvida com **Spring Boot**, contendo sistema completo de autenticação e CRUD para postagens, temas e usuários.

---
## 🚀 Tecnologias Utilizadas
**Java 17**  
**Spring Boot** (Spring Web, Spring Security, Spring Data JPA)  
**Hibernate** (ORM para banco de dados relacional)  
**MySQL** (Banco de dados relacional)  
**Maven** (Gerenciador de dependências)  
**Insomnia** (Para testar as requisições da API)

---

## 📌 Funcionalidades
✅ **Gestão de Usuários**  
✅ **Publicação de Posts**  
✅ **Categorização por Temas**  
✅ **Sistema de Comentários**  
✅ **Autenticação JWT**  
✅ **Validação de Campos**

---

## 🗃️ Modelo Relacional
**Tabela `tb_usuarios`**
| Campo | Tipo | Restrições |
|-------|------|------------|
| id | BIGINT | PK, AUTO_INCREMENT |
| nome | VARCHAR(100) | NOT NULL |
| usuario | VARCHAR(255) | UNIQUE, NOT NULL |
| senha | VARCHAR(255) | NOT NULL |
| foto | VARCHAR(255) | DEFAULT NULL |

**Tabela `tb_postagens`**
| Campo | Tipo | Relacionamento |
|-------|------|----------------|
| id | BIGINT | PK, AUTO_INCREMENT |
| titulo | VARCHAR(100) | NOT NULL |
| texto | VARCHAR(1000) | NOT NULL |
| data | TIMESTAMP | DEFAULT CURRENT_TIMESTAMP |
| usuario_id | BIGINT | FK → tb_usuarios.id |
| tema_id | BIGINT | FK → tb_temas.id |

**Tabela `tb_temas`**
| Campo | Tipo | Descrição |
|-------|------|-----------|
| id | BIGINT | PK, AUTO_INCREMENT |
| descricao | VARCHAR(255) | NOT NULL, UNIQUE |

---

## 🔄 Endpoints Principais
### **UsuárioController** (`/usuarios`)
`POST /cadastrar` - Cria novo usuário (permitAll)  
`POST /logar` - Gera token JWT (permitAll)  
`PUT /atualizar` - Atualiza dados do usuário (ROLE_USER)

### **PostagemController** (`/postagens`)
`GET /` - Lista todas postagens (permitAll)  
`POST /` - Cria nova postagem (ROLE_USER)  
`PUT /` - Atualiza postagem (ROLE_USER)  
`DELETE /{id}` - Exclui postagem (ROLE_ADMIN)

### **TemaController** (`/temas`)
`GET /` - Lista todos temas (permitAll)  
`POST /` - Cria novo tema (ROLE_ADMIN)  
`PUT /` - Atualiza tema (ROLE_ADMIN)  
`DELETE /{id}` - Remove tema (ROLE_ADMIN)

---
## 📂 Estrutura do Projeto
```
📦 src
┣ 📂 main
┃ ┣ 📂 java/com/generation/blogpessoal
┃ ┃ ┣ 📂 configuration   # SecurityConfig
┃ ┃ ┣ 📂 controller      # User/Post/Theme Controllers
┃ ┃ ┣ 📂 model           # Entidades JPA
┃ ┃ ┣ 📂 repository      # Interfaces CRUD
┃ ┃ ┣ 📂 security        # UserDetails + JWT
┃ ┃ ┗ 📜 BlogpessoalApplication.java
┃ ┗ 📂 resources
┃   ┣ 📜 application.properties
┃   ┗ 📜 data.sql         # Dados iniciais (opcional)

----

## ⚙️ Configuração
**application.properties**
spring.datasource.url=jdbc:mysql://localhost:3306/db_blogpessoal?createDatabaseIfNotExist=true&serverTimezone=UTC 
spring.datasource.username=**** 
spring.datasource.password=****
spring.jpa.hibernate.ddl-auto=update 
spring.mvc.pathmatch.matching-strategy=ANT_PATH_MATCHER

---

## 📜 Licença
Código aberto para fins educacionais. Desenvolvido como parte do bootcamp da Generation Brasil.
--

**Desenvolvido por:** Daniele Silveira 🚀  
**Última atualização:** Abril 2025


