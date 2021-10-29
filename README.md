# apirest-clientneoapp

API-REST: SPRING BOOT 

Linguagem de programação: Java 

Repositorio: https://github.com/OziasFilipe/apirest-clientneoapp 

Heroku: https://apirest-clientneoapp.herokuapp.com/swagger-ui.html#/controller-client/ClienteUsingGET 

 

Esta ApiRest Basico de estrutura web que faz o cadastro de clientes . 

# Os principais recursos são: 

 

Get (/cliente)  - (/cliente /{id}):                                       				obtém todos as informaçoes do banco de dados PostgreSQL, com o método get(cliente)  você pode pegar todos ou um único usuário citado através do parâmetro. 

 

Post (/ Cliente): 								Faz a inserção de dados no banco de dados, com o Post(cliente) poderá inserir dados no banco, sendo eles quasse todos obrigatórios, os dados não obrigatórios e o identificador único e a idade que e gerado conforme o ano de nascimento. 

 

Put (/ Cliente)  									Atualiza as informações já salvas no banco de dados, com ela poderá atualizar  os registros individuais ou todas de uma vez. 

 

Delete (/ Cliente ) - (/cliente /{id}) - (/cliente /deleteAll): 	Com esse método poderá deletar registros selecionados por parâmetro, por identificar e  deletar todos os registros de uma vez, sendo eles separados por rotas de DeleteAll e delete(ID) ou delete.   

	 

Tecnologias utilizadas para criar e testar 

	 

	Java 11 +  

	Spring Boot 

	MySQL e PostgreeSql  

	Postman  

	Heroku 

Swagger-UI 

 

WEB URL: 

	 

Swagger-UI: https://apirest-clientneoapp.herokuapp.com/swagger-ui.html#/ 

	Url-Get: https://apirest-clientneoapp.herokuapp.com/cliente 

 

Postman Teste URL:  

	Get: https://apirest-clientneoapp.herokuapp.com/cliente 

	Get: https://apirest-clientneoapp.herokuapp.com/cliente /1 

	Post: https://apirest-clientneoapp.herokuapp.com/cliente 

	Delete: https://apirest-clientneoapp.herokuapp.com/cliente 

Delete: https://apirest-clientneoapp.herokuapp.com/cliente /{id} 

Delete: https://apirest-clientneoapp.herokuapp.com/cliente /deleteAll 

	Put: https://apirest-clientneoapp.herokuapp.com/cliente 

 

 

Informação sobre oque foi feito  na API 

Suporte ao editor, incluindo: 

Conclusão. 

Verificações de tipo. 

Validação de dados: 

Erros automáticos e claros quando os dados são inválidos. 

Validação para objetos do tipo JSON. 

Validação de controle no banco de dados MySQL e PostGresQL 

Validação de teste de comportamento 

Validação Get, Post, Delete e Put dentro do Postman  

Validação Get, Post, Delete e Put dentro do Swagger-UI.html 

 

 

 

 

Funcionalidade:  

Permita criação de novos clientes.   

Permita a atualização de clientes existentes.   

Permita que listar todos os clientes cadastrados.  

Permita que buscas por atributos cadastrais do cliente.   

Gera a idade automaticamente conforme a data de nascimento cadastrada. 

 

 

Problemas que teve na hora do desenvolvimento 

 

Conexao com o banco de dados, o banco nao estava sendo reconhecido, o problema que estava aparenemente causando era o DLL do application.properties 

 

Heroke informou 2 problemas, um era a incompartibilidade com a versao 11 do Java, entao resolvi criando um arquivo como pediao no site system.properties, para informar que a versao do java era a 11 entao abrindo uma exeção do lado deles, ja o outro problema era a incompartibilidade com o banco de dados MySQL, entao fiz a migração do banco MySQL para PostGreSQL. 

Lombok não reconheceu, então foi feito os registros de forma manual os getter e setter. 
