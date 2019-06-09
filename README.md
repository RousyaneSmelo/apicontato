# apicontato
Projeto API com Spring Boot 


Grupo:

Rousyane Melo - 1810022860
Willma Tayanne - 1810022590
Walisson Marinho - 


Para executar a API a primeira vez:
#criar base de dados MySql - db_contatos (CREATE DATABASE db_contatos)
#Alterar no application.properties a 'propriedade spring.jpa.hibernate.ddl-auto' para = 'create-drop'

OBS: nesta primeira execução a API irá criar as tabelas de forma automatica no bando de dados.

Para executar uma proxima vez:
#Alterar no application.properties a 'propriedade spring.jpa.hibernate.ddl-auto' para = 'update'

OBS: nesta proxima execução a API não precisa mais criar as tabelas no banco de dados, mais se caso tenha modificado algum atributo 
das entidades as mesmas serão replicadas no banco de dados.

Para executar o projeto pelo CMD com Maven, entre no projeto abra o CMD e execute o seguinte comando:
mvn spring-boot:run

Como utilizar a API:

1 - GET - http://localhost:8080/contato

2 - POST - http://localhost:8080/contato/salvar
Request Body

{
        "nome": "Rousy",
        "email": "rousy@rousy.com",
        "telefones": [
            {
                "numero": "111111111111",
                "tipo": "RE"
            },
             {
                "numero": "22222222222",
                "tipo": "CE"
            }
        ]
}

3 - PUT -  http://localhost:8080/contato/alterar
Request Body

 {
        "id": 5,
        "nome": "TEstando ALTERADO",
        "email": "alterado@alterado.com",
        "telefones": [
            {
                "id": 6,
                "numero": "888888888",
                "tipo": "RE"
            }
        ]
}

4 - DELETE - http://localhost:8080/contato/deletar?id={id}
 