# API CRUD de Carros com Spring Boot

Este projeto demonstra a criação de uma API REST utilizando **Spring Boot**, aplicando operações CRUD com integração ao banco de dados através do **Spring Data JPA**.

A aplicação segue arquitetura em camadas e apresenta conceitos fundamentais do desenvolvimento backend com Java.

---

# 📂 Estrutura do Projeto

## 📁 `config`

Responsável pela configuração inicial da aplicação.

### `CarroConfig.java`

Utiliza `CommandLineRunner` para inserir dados automaticamente ao iniciar o sistema.

---

## 📁 `controller`

Camada responsável pelos endpoints REST.

### `CarroController.java`

Contém as operações CRUD:

* criar carro
* buscar por ID
* listar todos
* atualizar
* deletar

### Endpoints:

| Método | Endpoint           | Descrição             |
| ------ | ------------------ | --------------------- |
| GET    | `/carro`           | Lista todos os carros |
| GET    | `/carro/{id}`      | Busca por ID          |
| POST   | `/carro`           | Cria um carro         |
| PUT    | `/carro/path/{id}` | Atualiza um carro     |
| DELETE | `/carro/{id}`      | Remove um carro       |

---

## 📁 `entities`

### `Carro.java`

Entidade JPA que representa a tabela `tb_carro`.

### Atributos:

* `id`
* `marca`
* `modelo`
* `ano`

Utiliza:

* JPA/Hibernate
* Lombok
* JsonPropertyOrder

---

## 📁 `repository`

### `CarroRepository.java`

Interface que herda de `JpaRepository`, permitindo operações automáticas no banco de dados.

---

## 📁 `service`

### `CarroService.java`

Responsável pela lógica de negócio da aplicação.

Implementa:

* Create
* Read
* Update
* Delete

---

# 🧠 Conceitos Demonstrados

* Spring Boot
* REST API
* CRUD
* Spring Data JPA
* Hibernate
* Lombok
* Injeção de Dependência
* Arquitetura em Camadas

---

# 🚀 Fluxo da Aplicação

```txt id="x4n7pv"
Cliente → Controller → Service → Repository → Banco de Dados
```

---

# ⚙️ Como Executar

## Clone o repositório

```bash id="m8q2wr"
git clone https://github.com/seu-usuario/springboot-crud-carros.git
```

## Execute a aplicação

```bash id="u5p9kt"
./mvnw spring-boot:run
```

---

# 🛠️ Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* Lombok
* Maven

---

# 🎯 Objetivo do Projeto

Projeto desenvolvido para praticar a construção de APIs REST com Java e Spring Boot utilizando CRUD completo e integração com banco de dados.

Ideal para:

* estudo de backend Java
* prática com Spring Boot
* projetos de portfólio e GitHub

---

# 🤝 Contribuição

Contribuições são bem-vindas 🚀
