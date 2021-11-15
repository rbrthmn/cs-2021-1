## Tarefa 002 - 28/07/2021 - Pesquisa Rest API

### API RESTful
 
Antes de apresentar o conceito de uma API Rest, é necessário falar sobre as definições de API e Rest. API é o acrônimo em inglês de Application Programming Interface, ou, em português, interface de programação de aplicações, e, basicamente, é um conjunto de padrões e protocolos, cujo objetivo é ser usado como uma integração entre outras aplicações, podendo essas ser ou alguma aplicação front-end, ou um banco de dados, ou até mesmo outra API. Nessa integração pode haver ou não processamento de dados, com aplicação de regra de negócio ou não, dependendo das partes interessadas.

Já REST (Representational State Transfer), conceituado por Roy Fielding, é um estilo arquitetural, voltado para aplicações Web, tendo uma estruturação de código que visa facilitar a construção de interfaces de forma consistente, através da definição de papéis de componentes e restrições sobre as intterações entre componentes.

Portanto, uma API RESTful é uma API que implementa o estilo arquitetural REST, seguindo seus padrões. Uma REST API, comumente chamada também, utiliza protocolo HTTP para a comunicação entre os atores de uma arquitetura cliente/servidor, que, como dito anteriormente, é o foco do REST. As principais características do protocolo HTTP são a presença de um cabeçalho, a utilização das notações XML ou JSON para transferência de dados por meio do corpo da requisição, um path ou rota, e a utilização de verbos como representação de seus métodos, sendo os quatro principais o:
 - PUT - atualiza um recurso
 - GET - solicita um recurso
 - DELETE - deleta um recurso
 - POST - cria um recurso novo

Além disso, cada requisição de uma aplicação REST retorna um código definindo o status dessa, por exemplo:
- 200 (OK) - requisição realizada com sucesso
- 400 (BAD REQUEST) - código para erro genérico em uma requisição
- 404 (NOT FOUND) - recurso não encontrado
- 500 (INTERNAL SERVER ERROR) - houve algum erro por parte do servidor

Outras características de uma API RESTful são:
- Statleess, ou seja, não possui estado entre as comunicações, sendo cada uma independente e padronizada
- Possui alta escalabilidade, confiabilidade e segurança
- Armazena dados em cache

Um ponto interessante quando o assunto é REST API é Richardson Maturity Model, que visa analisar o quão uma API está de acordo com o REST, tendo até quatro níveis de maturidade:
- Level Zero Services: não utiliza recursos de URI, HTTP Methods e HATEOAS
- Level One Services: utiliza URI, os recursos são mapeados mas ainda não emprega o uso eficiente dos verbos, limitando-se apenas ao GET e POST
- Level Two Services: utiliza de forma eficiente as URIs e verbos HTTP
- Level Three Services: utiliza de forma eficiente as URIs, verbos HTTP e HATEOS, informando o que se fazer após uma requisição através dos controles hipermídia