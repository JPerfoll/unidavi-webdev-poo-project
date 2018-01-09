package br.unidavi.webdev.poo.project;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Modalidade {
 
    private String descricao;
    private List<Atleta> atletas;
    private List<Equipe> equipes;

    public Modalidade(String descricao) {
        this.descricao = descricao;
        
        atletas = new ArrayList<>();
        equipes = new ArrayList<>();
    }  

    public String getDescricao() {
        return descricao;
    }
    
    public void adicionaAtleta(Atleta atleta) {
        atletas.add(atleta);
    }
    
    public void adicionaAtleta(List<Atleta> atletas) {
        this.atletas = atletas;
    }
    
    public void adicionaEquipe(Equipe equipe) {
        equipes.add(equipe);
    }
    
    public void adicionaEquipe(List<Equipe> equipes) {
        this.equipes = equipes;
    }
    
    public void listaCompetidores() {
        Logger.getGlobal().info("    Competidores dessa modalidade: ");
        
        for (Atleta a : atletas) {
            Logger.getGlobal().info("        Atleta: " + a.getNome());
        }
        
        for (Equipe e : equipes) {
            Logger.getGlobal().info("        Equipe: " + e.getNome());
            e.listaAtletas();
        }
    }
}
