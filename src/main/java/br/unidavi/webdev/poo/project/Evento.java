package br.unidavi.webdev.poo.project;

import java.util.Date;
import java.util.List;
import br.unidavi.webdev.poo.project.Modalidade;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Evento {
    private String descricao;
    private Date data;
    private List<Modalidade> modalidades;

    public String getDescricao() {
        return descricao;
    }

    public Date getData() {
        return data;
    }

    private void setData(Date data) {
        this.data = data;
    }

    public List<Modalidade> getModalidades() {
        return modalidades;
    }

    public Evento(String descricao, Date data) {
        this.descricao = descricao;
        this.data = data;
        
        modalidades = new ArrayList<Modalidade>();
    }

    public Evento(String descricao, Date data, List<Modalidade> modalidades) {
        this.descricao = descricao;
        this.data = data;
        this.modalidades = modalidades;
    }
    
    public Boolean alteraDataEvento(Date novaData) {
        try {
            this.setData(novaData);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Boolean alteraDataEvento(String novaData) {
        try {
            Date dataNova = new Date(novaData);
            this.setData(dataNova);
            return true;
        } catch (Exception e) {
            return false;
        } 
    }
    
    public void adicionaModalidade(Modalidade modalidade) {
        modalidades.add(modalidade);
    }
    
    public void adicionaModalidade(List<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }
    
    public void listaModalidades() {
        Logger.getGlobal().info("");
        Logger.getGlobal().info("Listando as modalidades do evento " + this.getDescricao() + ":");
        int i = 1;
        
        for (Modalidade m : modalidades) {
            Logger.getGlobal().info("");
            Logger.getGlobal().info("    Modalidade: " + m.getDescricao());
            m.listaCompetidores();
            i++;
        }
    }
}
