API desenvolvida para o teste técnico da empresa effecti

Para buidar o projeto basta utilizar sua IDE e rodar o build,
isso fará com que o docker-compose seja chamado e faça o pull da imagem do postgres,o projeto está com flyway,
já tem migrations prontas para rodar e dados passa popular as tabelas, o application properties está junto no projeto
para preencher as variáveis de ambientes em desenvolvimento.

o endpoint de listagem de licitaçöes está protegido por token jwt com spring security, sendo necessário criar um novo usuário
para logar e acessar o recurso, basta acessar o "http://localhost:8080/" para abrir documentação no swagger, criar um novo usuario
e após logar e adicionar o token no authorized, os 2 endpoints já possuem exemplos, sendo ncessário somente enviar a request.

Tecnologias utilizadas - 

1 - Spring Boot <br>
2 - Spring Data JPA <br>
3 - Spring Security <br>
4 - Spring DevTools (Desenvolvimento) <br>
5 - Spring Docs <br>
6 - Spring support for compose <br>
7 - Bean Validation <br>
8 - Lombok <br>
9 - Flyway <br>
10 - JUnit <br>
11 - Mockito <br>



