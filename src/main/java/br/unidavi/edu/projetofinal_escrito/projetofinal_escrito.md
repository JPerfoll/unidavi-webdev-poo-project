Considerações escritas a respeito do projeto final:

########### Entidades do projeto ###########

1 - Evento

2 - Competidor
    1.1 - Atleta
    1.2 - Equipe

3 - Modalidade


########### Casos de uso do projeto ###########

1 - Agendar um evento;

2 - Reagendar um evento (alteração de data);

3 - Adicionar modalidades a um evento;

4 - Adicionar equipes ou atletas individuais a uma modalidade;

5 - Listar as modalidades de um evento (dentro da listagem de modalidades já inclui a listagem de equipes/atletas que estão disputando a mesma);


########### Aplicação da ferramenta de verificação ###########

[3] encapsulamento - verificar a quantidade de métodos de uma classe. Se a quantidade for muito exagerada, analisar a possibilidade de separar esses métodos em classes diferentes. (1 - necessário separar muitos métodos,  2 - separar só alguns,  3 - não há necessidade de separar)
[3] encapsulamento - analisar os tamanhos dos métodos e a possiblidade de ser dividido em métodos privados ou até mesmo em classes diferentes. (1 - todos os métodos são enormes, 2 - só alguns métodos precisam ser divididos, 3 - o tamanho dos métodos está ok)
[3] encapsulamento - analisar os métodos privados e a possibilidade de transforma-los em classes diferentes para que o código fique o mais encapsulado possível. (1 - possui muitos métodos privados, 2 - possui somente alguns métodos privados, 3 - não possui métodos privados)
[2] encapsulamento - ocultação da implementação: deixar visível para as outras classes somente o necessário, transformando assim métodos públicos em privados acessando-os através de getters e setters. (1 - não aplica ocultação, 2 - aplica pela metade, 3 - aplica ocultação em todo o programa)
[2] herança - verificar se é possível criar uma classe de herança para reutilização a partir de uma classe principal. (1 - não aplica herança, 2 - aplica herança)
[2] herança - analisar se a classe dispõe de métodos abstratos para que possam ser sobrescritos em uma subclasse. (1 - não possui métodos abstratos, 2 - possui métodos abstratos que são reescritos)
[2] herança - verificar o acesso protegido dos métodos e atributos para que o conceito de herança não seja perdido. (1 - não utiliza acesso protegido, 2 - utiliza em parte do código, 3 - utiliza corretamente em todo o código)
[1] polimorfismo - uso de acesso protegido, seja em métodos ou variáveis. (1 - utiliza em variáveis, 2 - utiliza em métodos, 3 - utiliza em métodos e variáveis)
[2] polimorfismo - uso de sobrescrita em métodos que podem ser reescritos alterando a forma original da classe extendida. (1 - não utiliza, 2 - utiliza corretamente)
[3] polimorfismo - uso de sobrecarga em métodos que podem ser reutilizados de forma diferente, aceitando até mesmo parâmetros diferentes. (1 - não utiliza, 2 - utiliza algumas vezes, 3 - utiliza muitas vezes)

Total final: 23 pontos
