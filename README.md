POC GRAPHQL

Antes de iniciar o projeto execute:
````
docker-compose up -d
````

Irá subir a imagem do banco de dados mysql, junto com adminer, acessivel via:
````
http://localhost:8080
````

| Usuário | Senha   | Base de Dados |
|---------|---------|----------|
| root    | pocpass | pocdb |

Após logar no adminer verá que as tabelas estão criadas e o banco de dados populado.

Para compilar o projeto:
> mvn clean package

Para rodar o projeto:
> mvn spring-boot:run

Acesse os endereços abaixo, para ter acesso a querys do graphql:
````
http://localhost:5000/playground
http://localhost:5000/graphiql
````



