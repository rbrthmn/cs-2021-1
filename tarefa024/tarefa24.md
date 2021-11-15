#Injeção de dependências

Injeção de Dependência é um é um padrão de projeto usado para evitar o alto nível de acoplamento de código dentro de uma
aplicação. Sistemas com baixo acoplamento de código são melhores pelos seguintes motivos: Aumento na facilidade de
manutenção/implementação de novas funcionalidades e também habilita a utilização de mocks para realizar unit testes.

Injeção de dependência é uma das duas maneiras de implementar a inversão de controle. Inversão de controle é um termo
mais amplo, onde a responsabilidade de informar a implementação a ser utilizada deixa de ser da classe, e passa a ser do
consumidor da classe. A segunda maneira de implementar a IoC seria com Service Locator. Toda implementação de inversão
de controle nos ajuda a seguir o primeiro e o último dos cincos princípios SOLID.

- S — Single-responsiblity principle
- O — Open-closed principle
- L — Liskov substitution principle
- I — Interface segregation principle
- D — Dependency Inversion Principle

O padrão Injeção de dependência diz: Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem
depender de abstrações.
Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

Para injeção de dependências, há três maneiras:
- Injeção por Construtor
- Injeção por Interface
- Injeção por propriedades(get/set)

###Injeção por Construtor
Acontece quando a classe a ser utilizada recebe por construtor uma instância de classe que ela mesmo irá utilizar.

###Injeção por Interface
Ao invés de receber o construtor por parâmetro, agora a classe deve receber uma abstração da implementação que ela irá
utilizar, através de uma interface. O grande benefício é que quem define qual implementação da abstração a ser
utilizada, é quem está utilizando a classe principal.

###Injeção por propriedades(get/set)
Ocorre quando se tem a classe a ser injetada exposta como uma propriedade.

###Frameworks auxiliares
Existem muitos frameworks que podem ajudar na hora de implementar o padrão Dependecy Injection. Para o Java, o framework
Spring fornece notações como @Component ou @Service, que servem para mapear tais dependências e seus tipos. Há outras
bibliotecas que podem fornecer essa mesma função de forma diferente, ficando a critério de quem vai implementá-las.