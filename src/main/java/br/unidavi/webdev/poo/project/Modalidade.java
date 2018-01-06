package br.unidavi.webdev.poo.project;

import br.unidavi.webdev.poo.project.Competidor;
import java.util.ArrayList;
import java.util.List;

public class Modalidade {
 
    private String descricao;
    private List<Atleta> atletas;
    private List<Equipe> equipes;

    public Modalidade(String descricao) {
        this.descricao = descricao;
        
        atletas = new ArrayList<Atleta>();
        equipes = new ArrayList<Equipe>();
    }  

    public String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
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
        System.out.println("    Competidores dessa modalidade: ");
        int i = 1;
        
        for (Atleta a : atletas) {
            System.out.println("        Atleta " + i + ": " + a.getNome());
            i++;
        }
        
        int j = 1;
        
        for (Equipe e : equipes) {
            System.out.println("        Equipe " + j + ": " + e.getNome());
            e.listaAtletas();
            j++;
        }
    }
}
