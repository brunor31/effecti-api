API desenvolvida para o teste técnico da empresa effecti

Para buildar o projeto basta rodar o comando na raiz do projeto pelo terminal ou IDE (necessário docker instalado).<br>
```bash
docker-compose up -d
```
O endpoint de listagem de licitaçöes está protegido por token jwt com spring security, sendo necessário criar um novo usuário
para logar e acessar o recurso, os 2 endpoints já possuem exemplos, sendo ncessário somente enviar a request.

Endereço para documentação no swagger.
```bash
http://localhost:8000
````

Tecnologias utilizadas - 

1 - Spring Boot <br>
2 - Spring Data JPA <br>
3 - Spring Security <br>
4 - Spring DevTools (Desenvolvimento) <br>
5 - Spring Docs <br>
6 - Spring support for compose <br>
7 - Bean Validation <br>
8 - Lombok <br>


