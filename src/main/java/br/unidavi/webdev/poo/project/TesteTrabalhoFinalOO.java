package br.unidavi.webdev.poo.project;

import java.util.Date;
import br.unidavi.webdev.poo.project.Evento;
import br.unidavi.webdev.poo.project.Modalidade;
import br.unidavi.webdev.poo.project.Atleta;
import br.unidavi.webdev.poo.project.Equipe;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TesteTrabalhoFinalOO {
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("12/07/2017");

        /* Exemplo de criação de Evento adicionando uma lista de modalidades */
        Evento evento = new Evento("Rio 2016 - Dia 1", data);
        
        List<Modalidade> modalidades = new ArrayList<>();
        
        /* Essa competição é individual, portanto adiciona uma lista de atletas */
        Modalidade modalidade = new Modalidade("100M rasos");
        List<Atleta> atletas = new ArrayList<>();
        
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
        List<Equipe> equipes = new ArrayList<>();
        
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
        evento.alteraDataEvento("01/01/2016");

        evento.listaModalidades();
        
        
        /* Exemplo de criação de Evento já passando uma lista de modalidades como parâmetro */
        Logger.getGlobal().info("--------------");
        Evento evento2 = new Evento("Rio 2016 - Dia 2", data, modalidades);
        evento2.alteraDataEvento("01/02/2016");
        evento2.listaModalidades();
        
        
        /* Exemplo de criação de Evento inserindo individualmente as modalidades depois do evento já criado */
        Logger.getGlobal().info("--------------");
        Evento evento3 = new Evento("Rio 2016 - Dia 3", data);
        evento3.alteraDataEvento("01/03/2016");
        
        evento3.adicionaModalidade(new Modalidade("100M rasos")); 
        evento3.listaModalidades();
    }
}
