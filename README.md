# ✍️ Blog Pessoal

Projeto de uma API REST para gestão de blog pessoal desenvolvida com **Spring Boot**, contendo funcionalidades completas de CRUD para posts, comentários e usuários, com sistema de autenticação básica.

## 🚀 Tecnologias Utilizadas
**Java 17**  
**Spring Boot** (Spring Web, Spring Security, Spring Data JPA)  
**Hibernate** (ORM para banco de dados relacional)  
**MySQL** (Banco de dados relacional)  
**Maven** (Gerenciador de dependências)  
**Insomnia** (Para testar as requisições da API)

## 📌 Funcionalidades
**CRUD de Usuários** (Cadastro, Login, Atualização de perfil)  
**CRUD de Postagens** (Criação, Edição, Exclusão de posts)  
**Sistema de Comentários** (Interação entre usuários)  
**Autenticação JWT** (Proteção de endpoints sensíveis)  
**Validações** (Bean Validation para campos obrigatórios)

## 🗃️ Estrutura do Banco de Dados
**Tabela `tb_usuarios`**
| Campo | Tipo |
|-------|------|
| id | BIGINT (PK, Auto Increment) |
| nome | VARCHAR(100) |
| usuario | VARCHAR(255) |
| senha | VARCHAR(255) |
| foto | VARCHAR(255) |

**Tabela `tb_postagens`**
| Campo | Tipo |
|-------|------|
| id | BIGINT (PK, Auto Increment) |
| titulo | VARCHAR(100) |
| texto | VARCHAR(1000) |
| data | TIMESTAMP |
| usuario_id | BIGINT (FK - `tb_usuarios.id`) |

## 🔄 Endpoints Principais
**UsuarioController** (`/usuarios`)
`POST /usuarios/cadastrar` - Cadastro de novo usuário  
`POST /usuarios/logar` - Autenticação do usuário  
`PUT /usuarios/atualizar` - Atualização de dados do usuário

**PostagemController** (`/postagens`)
`GET /postagens` - Lista todas as postagens [1]  
`GET /postagens/{id}` - Busca postagem por ID  
`POST /postagens` - Cria nova postagem (requer autenticação)  
`PUT /postagens` - Atualiza postagem existente  
`DELETE /postagens/{id}` - Remove postagem

## 📂 Estrutura do Projeto
src/ ├── main/ │   ├── java/com/generation/blogpessoal/ │   │   ├── config       # Configurações de segurança │   │   ├── controller   # Endpoints da API │   │   ├── model        # Entidades JPA │   │   ├── repository   # Interfaces de acesso a dados │   │   ├── security     # Configurações de autenticação │   │   └── BlogpessoalApplication.java │   └── resources/ │       └── application.properties


## 📜 Licença
Projeto desenvolvido para fins educacionais. Código aberto para estudo e adaptação.

**Desenvolvido por:** Daniele Silveira 🚀 [2]
