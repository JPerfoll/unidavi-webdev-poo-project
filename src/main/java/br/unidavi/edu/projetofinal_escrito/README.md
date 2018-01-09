Para executar a entrega 1 do projeto que foi postada em novembro, basta abrir o arquivo

"TesteTrabalhoFinalOO.java" que encontra-se dentro do pacote br.unidavi.webdev.poo.project.

Esse arquivo java tem como objetivo executar todos os casos de usos descritos no arquivo

"projetofinal_escrito.md" deste mesmo pacote.
Como pode ser observado dentro da própria classe java citada acima, inicialmente um evento é
criado com a descrição "Rio 2016 - Dia 1" e com uma data pré-definida através de uma variável do tipo
Date (Linha 18).
Após a criação do objeto "evento", o restante dos dados começa a ser inserido. Uma variável do
tipo ArrayList é criada com o nome de modalidades estendendo a classe Modalidade (Linha 20). É feito
dessa forma pois um evento pode conter várias modalidades.

Com a lista de modalidades instanciada, a primeira modalidade é criada na variável
"modalidade" com o nome "100M rasos" (Linha 23). Uma modalidade pode ser do tipo individual e do
tipo equipe. A primeira modalidade é do tipo individual, então novamente um ArrayList com o nome de
“atletas” é criado estendendo da classe Atleta (Linha 24). Com o ArrayList instanciado, variáveis com os
nomes “atleta1”, “atleta2”, “atleta3” e “atleta4” são instanciadas a partir da classe Atleta individualmente
(Linhas 26 à 29). Cada atleta é inserido através do método “add” dentro do ArrayList de atletas (Linhas
31 à 34).

Então após os atletas serem criados como descrito acima, eles são adicionados à primeira
modalidade utilizando o método “adicionaAtleta” e passando como parâmetro a lista previamente
alimentada com as informações dos atletas (Linha 36). Então com todas as informações da modalidade
preenchida, ela é inserida na lista de modalidades através do método “add” (Linha 37).

Outra modalidade é criada com o nome de “Voleibol” (Linha 40). Essa modalidade é do tipo
equipe, portanto um ArrayList chamado “equipes” é criado estendendo a classe “Equipe” (Linha 41).
Equipes são compostas por atletas, portanto cada equipe é criada e depois os atletas são adicionados
dentro delas (Linhas 43 à 51). Com as equipes criadas, as instâncias “equipe1” e “equipe2” são
adicionadas ao ArrayList “equipes” previamente criado (Linhas 53 e 54).

Feito isso, o ArrayList “equipes” é adicionado à modalidade2 (“Voleibol”) através do método
“adicionaEquipe” e passando como parâmetro o próprio ArrayList (Linha 56). Agora é só adicionar a
modalidade “Voleibol” à lista de modalidades (Linha 57);

Depois do ArrayList modalidades ser alimentado, essas modalidades são inseridas no evento

através do método “adicionaModalidade” passando como parâmetro a própria lista (Linha 60).
Nas linhas 61 à 63 temos um exemplo de como a data de um evento é alterada através do método
“alteraDataEvento”.
Na Linha 65 é chamado o método “listaModalidades”, que como o próprio nome já diz, percorre
e escreve em tela a lista das modalidades do evento anteriormente configurado.

Na Linha 70, um evento é criado com o nome “Rio 2016 – Dia 2” e o que muda é apenas o
construtor. Nessa linha a lista de modalidades já é passada diretamente no construtor e então na linha 74
novamente é chamado o método “listaModalidades” com o intuito de mostrar que ficou igual ao evento
criado anteriormente.
O evento3 com o nome “Rio 2016 – Dia 3” é criado exatamente da mesma forma que o evento
um (Linha 79). Porém na linha 84 foi adicionado um exemplo de como adicionar uma modalidade
instanciando ela diretamente no construtor e logo na linha seguinte listando as modalidades do evento.
Apenas para mostrar que funciona da outra forma também.

Na primeira entrega não foram feitos testes, achei que não eram necessários. 
Estarei desenvolvendo e adicionando os testes para a segunda entrega do projeto.

------------------------

O penúltimo commit solicitado foi "Criar um commit com resolução de todas as issues relatadas pelo sonarqube". Porém todas as issues já foram resolvidas em um commit anterior.
Parágrafo sendo alterado apenas para enviar um commit para o GitHub.

------------------------

O último commit solicitado foi "commit com revisão de código de cada classe conforme ferramenta de inspeção criada na semana 1".
Todas as classes ja foram inicialmente desenvolvidas no padrão da ferramenta de inspeção que criamos na primeira semana. Já me preocupei em seguir todos os passos e checklists.
Parágrafo sendo alterado apenas para enviar um commit para o GitHub.