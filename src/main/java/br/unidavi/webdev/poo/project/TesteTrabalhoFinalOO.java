package br.unidavi.webdev.poo.project;

import java.util.Date;
import br.unidavi.webdev.poo.project.Evento;
import br.unidavi.webdev.poo.project.Modalidade;
import br.unidavi.webdev.poo.project.Competidor;
import br.unidavi.webdev.poo.project.Atleta;
import br.unidavi.webdev.poo.project.Equipe;
import java.util.ArrayList;
import java.util.List;

public class TesteTrabalhoFinalOO {

    public static void main(String[] args) {
        Date data = new Date("12/07/2017");
        
        /* Exemplo de criação de Evento adicionando uma lista de modalidades */
        Evento evento = new Evento("Rio 2016 - Dia 1", data);
        
        List<Modalidade> modalidades = new ArrayList<Modalidade>();
        
        /* Essa competição é individual, portanto adiciona uma lista de atletas */
        Modalidade modalidade = new Modalidade("100M rasos");
        List<Atleta> atletas = new ArrayList<Atleta>();
        
        Atleta atleta1 = new Atleta("João Carlos", "Perna Longa", 28);
        Atleta atleta2 = new Atleta("Pedro Paulo", "Tonico", 31);
        Atleta atleta3 = new Atleta("Enzo Ferrari", "Boy", 24);
        Atleta atleta4 = new Atleta("Vilson Rocha", "Rocha", 35);
        
        atletas.add(atleta1);
        atletas.add(atleta2);
        atletas.add(atleta3);
        atletas.add(atleta4);
        
        modalidade.adicionaAtleta(atletas);
        modalidades.add(modalidade);
        
        /* Essa competição é em time, portanto adiciona um time e adiciona atletas ao time */
        Modalidade modalidade2 = new Modalidade("Voleibol");
        List<Equipe> equipes = new ArrayList<Equipe>();
        
        Equipe equipe1 = new Equipe("Holanda", "Laranja Mecânica", 102);
        equipe1.adicionaAtleta(new Atleta("João", "Canário", 35));
        equipe1.adicionaAtleta(new Atleta("Marcos", "João de Barro", 32));
        equipe1.adicionaAtleta(new Atleta("Pedro", "Calopsita", 31));
        
        Equipe equipe2 = new Equipe("Itália", "Azurra", 109);
        equipe2.adicionaAtleta(new Atleta("Vicente", "Apelido 1", 37));
        equipe2.adicionaAtleta(new Atleta("Vilson", "Apelido 2", 39));
        equipe2.adicionaAtleta(new Atleta("Joanir", "Apelido 3", 31));
        
        equipes.add(equipe1);
        equipes.add(equipe2);
        
        modalidade2.adicionaEquipe(equipes);        
        modalidades.add(modalidade2);
        
        // Adiciona as modalidades ao evento
        evento.adicionaModalidade(modalidades);
        if (evento.alteraDataEvento("01/01/2016")) {
            System.out.println("Data do evento " + evento.getDescricao() + " alterada para " + evento.getData());
        };

        evento.listaModalidades();
        
        
        /* Exemplo de criação de Evento já passando uma lista de modalidades como parâmetro */
        System.out.println("--------------");
        Evento evento2 = new Evento("Rio 2016 - Dia 2", data, modalidades);
        if (evento2.alteraDataEvento("01/02/2016")) { // formato de data mm/dd/yyyy
            System.out.println("Data do evento " + evento2.getDescricao() + " alterada para " + evento2.getData());
        };
        evento2.listaModalidades();
        
        
        /* Exemplo de criação de Evento inserindo individualmente as modalidades depois do evento já criado */
        System.out.println("--------------");
        Evento evento3 = new Evento("Rio 2016 - Dia 3", data);
        if (evento3.alteraDataEvento("01/03/2016")) {
            System.out.println("Data do evento " + evento3.getDescricao() + " alterada para " + evento3.getData());
        };
        
        evento3.adicionaModalidade(new Modalidade("100M rasos")); 
        evento3.listaModalidades();
    }
}
