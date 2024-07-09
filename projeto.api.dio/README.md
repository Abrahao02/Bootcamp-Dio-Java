# Projeto API com Spring Boot

Este projeto é uma aplicação de exemplo que demonstra como criar uma API RESTful utilizando Spring Boot, integrando o pacote Viacep para consulta de CEPs.

## Pré-requisitos

Certifique-se de ter instalado em sua máquina:

- Java JDK 11 ou superior
- Maven 2.x ou superior
- IDE de sua preferência (recomendado: IntelliJ IDEA, Eclipse)

## Uso da API

GET /clientes: Retorna todos os clientes cadastrados.

GET /clientes/{id}: Retorna o cliente com o ID especificado.

POST /clientes: Cria um novo cliente. Exemplo de corpo da requisição:

PUT /clientes/{id}: Atualiza o cliente com o ID especificado. Exemplo de corpo da requisição:

DELETE /clientes/{id}: Remove o cliente com o ID especificado.

## Exemplo de Uso

Pode se utilziar o swagger para uma vizualicao mais bonita: http://localhost:8080/swagger-ui.html
