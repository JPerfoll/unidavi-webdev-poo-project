package br.unidavi.webdev.poo.project;

import br.unidavi.webdev.poo.project.Atleta;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Equipe extends Competidor {
    
    private List<Atleta> jogadores;
    private int numeroTrofeus;

    public int getNumeroTrofeus() {
        return numeroTrofeus;
    }

    public void setNumeroTrofeus(int numeroTrofeus) {
        this.numeroTrofeus = numeroTrofeus;
    }

    public List<Atleta> getJogadores() {
        return jogadores;
    }

    public Equipe(List<Atleta> jogadores, String nome, String apelido, int idade) {
        super(nome, apelido, idade);
        this.jogadores = jogadores;
    }

    public Equipe(String nome, String apelido, int idade) {
        super(nome, apelido, idade);
        
        jogadores = new ArrayList<Atleta>();
    }    

    public void adicionaAtleta(Atleta atleta) {
        jogadores.add(atleta);
    }
    
    public void adicionaAtleta(List<Atleta> atletas) {
        this.jogadores = atletas;
    }
    
    @Override
    void defineVencedor() {
        this.numeroTrofeus++;
        
        for (Atleta a : jogadores) {
            a.defineVencedor();
        }
    }
    
    public void listaAtletas() {
        Logger.getGlobal().info("        Listando os atletas:");
        
        for (Atleta a : jogadores) {
            Logger.getGlobal().info("            Atleta: " + a.getNome());
        }
    }
}
