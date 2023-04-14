# 🔴Projeto/Desafio Spring Data JPA na Prática

Meu objetivo com este projeto é aprender os principais conceitos de mapeamento objeto relacional (ORM) utilizando o Spring Data JPA, por meio do desenvolvimento de uma API RESTful que represente o domínio de uma academia de ginástica, focando na modelagem das entidades da API, a fim de entender melhor como funciona a utilização do ORM na prática.

## 🛠 Tecnologias Utilizadas

- IDE IntelliJ
- Java 11
- MavenS
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Hibernate Validator
- Lombok
- Postman

## 📋Anotações de Mapeamento 

@**Entity**
Usada para especificar que a classe anotada atualmente representa um tipo de entidade.

@**Table**
Usada para especificar a tabela principal da entidade atualmente anotada.

@**Id**
Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.

@**GeneratedValue**
Especifica que o valor do identificador de entidade é gerado automaticamente.

@**Column**
Usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados.

@**JoinColumn**
Usada para especificar a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento.

@**OneToMany**
Usada para especificar um relacionamento de banco de dados um-para-muitos.

@**OneToOne**
Usada para especificar um relacionamento de banco de dados um-para-um.

@**ManyToOne**
Usada para especificar um relacionamento de banco de dados muitos-para-um.

**cascade**
Realizar operações em cascata só faz sentido em relacionamentos Pai - Filho.

**mappedBy**
Indica qual é o lado inverso ou não dominante da relação.

## 🚦Instruções de Instalação e Uso

### Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- IDE IntelliJ
- Java 11
- Maven
- PostgreSQL

### Configuração do banco de dados

1. Crie um banco de dados PostgreSQL com o nome "academia" e defina um usuário e senha.
2. Abra o arquivo "application.yml" em src/main/resources.
3. Altere as propriedades "spring.datasource.username" e "spring.datasource.password" para as suas credenciais de banco de dados.

### Testando a API RESTful

Instale o aplicativo Postman em seu ambiente de desenvolvimento.

Abaixo, segue uma lista de exemplos caso queira cadastra um novo aluno:

- POST /alunos - Cria um novo aluno.
- GET /alunos - Retorna uma lista com todos os alunos cadastrados.
- GET /alunos/{id} - Retorna as informações de um aluno específico.
- PUT /alunos/{id} - Atualiza as informações de um aluno específico.
- DELETE /alunos/{id} - Remove um aluno específico.

Você pode enviar as requisições HTTP utilizando os seguintes modelos de JSON:

- Criação de um novo aluno:

```
{
    "nome": "Nome do aluno",
    "cpf": "222.222.222-22",
    "bairro": "Bairo do aluno",
    "dataDeNascimento": "01/01/2001"
}
```

- Atualização de informações de um aluno:

```
{
    "nome": "Nome do aluno",
    "bairro": "Bairo novo do aluno",
    "dataDeNascimento": "01/02/2001"
}
```

### Dúvidas frequentes

1. O que é ORM e como o Spring Data JPA o utiliza?
   - ORM significa Mapeamento Objeto-Relacional e é uma técnica para mapear objetos de uma aplicação orientada a objetos em tabelas de banco de dados relacionais. O Spring Data JPA usa o Hibernate para fornecer uma camada de abstração que mapeia entidades Java para tabelas de banco de dados.
2. Como eu posso adicionar novas entidades e relacionamentos no projeto?
   - Para adicionar novas entidades, basta criar uma nova classe Java anotada com @Entity e definir seus atributos e relacionamentos com outras entidades usando as anotações apropriadas, como @OneToMany, @OneToOne e @ManyToOne. Em seguida, é necessário atualizar o banco de dados com as alterações de esquema usando a opção "spring.jpa.hibernate.ddl-auto=update" no arquivo application.properties.
3. Como posso contribuir para o projeto?
   - Você pode contribuir para o projeto enviando solicitações pull ou abrindo problemas na seção de problemas do repositório no GitHub. Certifique-se de seguir as diretrizes de contribuição do projeto antes de enviar qualquer solicitação pull.



