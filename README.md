# API CRUD de Carros com Spring Boot

Este repositório demonstra a construção de uma API REST completa utilizando **Spring Boot**, aplicando operações CRUD com integração ao banco de dados através do **Spring Data JPA**.

O projeto foi estruturado utilizando arquitetura em camadas e apresenta conceitos fundamentais do desenvolvimento backend moderno com Java.

---

# 📂 Estrutura do Projeto

## 📁 `config`

Camada responsável pelas configurações e inicialização da aplicação.

---

## `CarroConfig.java`

Classe responsável por inserir dados iniciais no banco utilizando `CommandLineRunner`.

```java id="k8m3vt"
public class CarroConfig implements CommandLineRunner
```

### Função:

* executar código automaticamente ao iniciar a aplicação
* popular o banco de dados com registros iniciais

### Exemplo:

```java id="u2p9wr"
Carro c1 = new Carro(
        null,
        "Porsche",
        "911",
        2017);

carroRepository.saveAll(Arrays.asList(c1));
```

---

# 📁 `controller`

Camada responsável pelos endpoints REST da aplicação.

Recebe requisições HTTP e retorna respostas para o cliente.

---

## `CarroController.java`

Classe anotada com:

```java id="p7v4mx"
@RestController
@RequestMapping("/carro")
```

Define:

* controller REST
* rota base `/carro`

---

# 🧠 Conceitos Demonstrados no Controller

## 🔹 Endpoint POST — Criar Carro

```java id="y5n2qt"
@PostMapping
public ResponseEntity<Carro> create(
        @RequestBody Carro obj)
```

### Exemplo:

```http id="m1r8wx"
POST /carro
```

### Body JSON:

```json id="g4p7ls"
{
  "marca": "Porsche",
  "modelo": "911",
  "ano": 2017
}
```

---

## 🔹 Endpoint GET — Buscar por ID

```java id="z6m3kv"
@GetMapping("/{id}")
```

### Exemplo:

```http id="n8q1pt"
GET /carro/1
```

---

## 🔹 Endpoint PUT — Atualizar

```java id="w3t9rx"
@PutMapping("path/{id}")
```

Atualiza os dados de um carro existente.

---

## 🔹 Endpoint DELETE — Remover

```java id="c5v2my"
@DeleteMapping("/{id}")
```

Remove um carro do banco de dados.

---

## 🔹 Endpoint GET — Listar Todos

```java id="h7p4qw"
@GetMapping
```

Retorna todos os carros cadastrados.

---

# 📁 `entities`

Camada responsável pelas entidades da aplicação.

Representa os dados persistidos no banco.

---

## `Carro.java`

Classe anotada com JPA:

```java id="b2n8vt"
@Entity
@Table(name = "tb_carro")
```

Representa a tabela `tb_carro`.

---

# 🧠 Conceitos Demonstrados na Entity

## 🔹 JPA/Hibernate

Mapeamento objeto-relacional utilizando:

* `@Entity`
* `@Table`
* `@Id`
* `@GeneratedValue`

```java id="f4m1zy"
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```

---

## 🔹 Lombok

O projeto utiliza Lombok para reduzir código boilerplate.

### Anotações utilizadas:

```java id="x9r3pk"
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
```

Geram automaticamente:

* construtores
* getters
* setters

---

## 🔹 Ordenação do JSON

```java id="j6q8ws"
@JsonPropertyOrder({
    "id",
    "marca",
    "modelo",
    "ano"
})
```

Define a ordem dos atributos no JSON retornado pela API.

---

# 📁 `repository`

Camada responsável pela comunicação com o banco de dados.

---

## `CarroRepository.java`

Interface que herda de `JpaRepository`.

```java id="r1p7tx"
public interface CarroRepository
        extends JpaRepository<Carro, Long>
```

O Spring gera automaticamente:

* save
* findById
* findAll
* deleteById
* update

---

# 📁 `service`

Camada responsável pela lógica de negócio da aplicação.

---

## `CarroService.java`

Classe anotada com:

```java id="q8m2vy"
@Service
```

Responsável por:

* criar carros
* buscar registros
* atualizar dados
* deletar registros

---

# 🧠 Conceitos Demonstrados no Service

## 🔹 CRUD Completo

### Create

```java id="n3w7pk"
public Carro create(Carro obj)
```

---

### Read

```java id="k5r1xt"
public Optional<Carro> findById(Long id)
```

---

### Update

```java id="u7m4qy"
public Carro update(Carro obj)
```

---

### Delete

```java id="z2p8wr"
public void delete(Long id)
```

---

# 🚀 Fluxo da Aplicação

```txt id="v4n6ks"
Cliente HTTP
      ↓
Controller
      ↓
Service
      ↓
Repository
      ↓
Banco de Dados
```

---

# 🌐 Endpoints da API

| Método | Endpoint           | Descrição             |
| ------ | ------------------ | --------------------- |
| GET    | `/carro`           | Lista todos os carros |
| GET    | `/carro/{id}`      | Busca carro por ID    |
| POST   | `/carro`           | Cria um novo carro    |
| PUT    | `/carro/path/{id}` | Atualiza um carro     |
| DELETE | `/carro/{id}`      | Remove um carro       |

---

# ⚙️ Como Executar

## 1️⃣ Clone o repositório

```bash id="m9q2wx"
git clone https://github.com/seu-usuario/springboot-crud-carros.git
```

---

## 2️⃣ Abra o projeto

Você pode utilizar:

* IntelliJ IDEA
* VS Code
* Spring Tool Suite

---

## 3️⃣ Execute a aplicação

Via Maven:

```bash id="t5p8rv"
./mvnw spring-boot:run
```

---

# 📚 Conceitos Praticados

Este projeto demonstra na prática:

* Spring Boot
* REST API
* CRUD
* Spring Data JPA
* Hibernate
* Lombok
* Entities
* Controllers
* Services
* Repositories
* Dependency Injection
* Arquitetura em Camadas

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

Este projeto foi desenvolvido para praticar a construção de APIs REST completas com Java e Spring Boot.

Ideal para:

* iniciantes em Spring
* prática com CRUD
* estudo de JPA/Hibernate
* projetos de portfólio
* aprendizado de arquitetura backend

---

# 🤝 Contribuição

Contribuições são bem-vindas!

Sugestões de melhorias, novos endpoints ou otimizações podem ser enviadas via Pull Request 🚀
