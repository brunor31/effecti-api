API desenvolvida para o teste técnico da empresa effecti

<strong>Requisitos:</strong>

* Docker instalado

<strong>Como executar:</strong>

1. Na raiz do projeto, execute ```docker-compose up -d``` para iniciar a API.
2. Acesse a documentação da API no Swagger: http://localhost:8000

<strong>Funcionalidades:</strong>

* Criação de usuários
* Login
* Listagem de licitações (protegido por token JWT)

<strong>Tecnologias utilizadas:</strong>
* Spring Boot
* Spring Data JPA
* Spring Security
* Spring DevTools (Desenvolvimento)
* Spring Docs
* Spring support for compose
* Bean Validation
* Lombok

End-points:

* POST /api/auth/register (Cria um novo usuário)
* POST /api/auth/login (Login)
* GET /api/licitacoes (Lista licitações)
