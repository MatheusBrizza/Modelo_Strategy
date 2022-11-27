# Modelo_Strategy


1- O que são Design Patterns? Por que é interessante utilizá-los?

Padrões de projeto são são soluções generalistas para 
problemas recorrentes durante o desenvolvimento de um 
software. Não se trata de um framework ou um código pronto, 
mas de uma definição de alto nível de como um problema comum 
pode ser solucionado.

2- Quais são os tipos de Design Patterns?

Design patterns são divididos em 3 tipos: comportamentais, 
criacionais e estruturais.

3- Para cada tipo de Design Pattern acima, cite 1 Design 
Pattern.

Comportamentais: Chain of responsibility

Criacionais: Singleton

Estruturais: Decorator

4- Para cada Design Pattern citado, explique com suas 
palavras o motivo de sua utilização em um projeto de 
Software.

Chain of responsibility: este padrão funciona que uma requisição
passe por diversas classes que vão resolvendo o que puderem
da requisição e o que não conseguirem resolver passam para a 
seguinte até que a requisição seja atendida.

Ex exdrúxulo: 
requisição: fazer login no site xpto.
classe 1: valida nome do usuário
classe 2: valida senha
classe 3: valida se usuário já está logado em outra máquina.

Com isso, todas as classes resolveram a requisição, cada uma
cuidou de um pedaço dela e o que não conseguia passou adiante.


Singleton: é utilizado para quando uma classe que não gerencia 
um estado do aplicativo é muito utlizada por diversas partes 
diferentes dele.

Decorator: serve para adicionar novos comportamentos em objetos
colocando eles dentro de outros objetos que contém tais 
comportamentos.
Diferente de herança que não é possível modificar após ser
iniciado, no lugar é usado agregação onde um objeto 
referencia outro e delega parte do trabalho para ele.



