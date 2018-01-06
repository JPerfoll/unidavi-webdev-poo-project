package br.unidavi.webdev.poo.project;

public class Atleta extends Competidor {

    private int numeroMedalhas;

    public int getNumeroMedalhas() {
        return numeroMedalhas;
    }

    public void setNumeroMedalhas(int numeroMedalhas) {
        this.numeroMedalhas = numeroMedalhas;
    }
    
    public Atleta(String nome, String apelido, int idade) {
        super(nome, apelido, idade);
    } 

    @Override
    void defineVencedor() {
        this.numeroMedalhas++;
    }
}
