<p style="text-align: center;"><font size="5"><b>Git Exercícios</b></font></p1></p>
<DIV align="justify">

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
    R: git --version
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
    R: Mostra os possíveis comandos do git
  b. git help checkout
    R: Abre uma página web com detalhes do comando de checkout
  c. git help merge
    R: Abre uma página web com detalhes do comando de merge
  d. git init
    R: Inicia um repositório localmente
  e. git add --all
    R: Adiciona todas mudanças no repositório local para o estado de staged
  f. git add -u
    R: Atualiza ou remove arquivos previamente em estado de staged
  g. git config -l
    R: Lista todas variáveisdo arquivo de configuração do git juntamente com seus valores
  h. git mv a.txt b.txt
    R: Renomeio o arquivo a.txt para b.txt
  i. git reset --hard
    R: Descarta todas mudanças não commitadas, retornando para o estado do último commit
  j. git log -27
    R: Mostra os logs dos últimos 27 commits
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
    R: git add e git commit
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
    R: git diff ou git status
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
    R: git status ou git commit
6. Qual o comando para efetuar um _commit_?
    R: git commit -m [mensagem do commit]
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
    R: git checkout teste.txt
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
    R: Adicionar o path ou caminho desse diretório dentro de um arquivo .gititnore
9. O que acontece se o seu repositório local for acidentalmente removido?
    R: O repositório remoto ainda existirá
10. Como clonar um repositório remoto?
    R: git clone [endereço http do repositório]
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
    R: git log --oneline
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
    R: .git
13. Qual o comando para criar um repositório local?
    R: git init
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
    R: .git
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
    R: git add -A
16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
    R: Ele utiliza o hash para criptografar a identificação do commit, deixando-o único e não sequencial. SHA1 é uma função hash.
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
    R: git show --summary
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
    R: Não
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
    R: O repositóro volta para o commit anterior da branch atual
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
    R: git clean
21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
    R: .gitignore
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
    R: Adicionar o texto ".class" em uma linha no arquivo .gitignore
23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
    R: Lista os contribuintes do repositório e suas respectivas quantidades de commits
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
    R: Tenta manter o repositório local e remoto atualizados
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
    R: git tag
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
    R: git tag -l 2.0
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
    R: Cria a tag 3.4-gold na HEAD com a mensagem “minha versão ouro”
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
    R: Mostra o commit com essa tag e a mensagem da tag
30. O que o comando **git push origin 3.4-gold** teria como efeito?
    R: Criado essa tag no repositório remoto
31. Após executar um commit, qual o efeito de **git commit --amend**?
    R: Sobrescreve o commit anterior caso esta não tenha sido enviada ao remoto
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
    R: Retorna o arquivo x.txt para o estado de untracked
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
    R: Remove as mudanças do arquivo a.txt
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
    R: O comando "git reset HEAD a.txt" apenas retira o arquivo a.txt do estado de staged enquanto que o comando "git checkout -- a.txt" remove as mudanças desse arquivo.
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.

</DIV/>