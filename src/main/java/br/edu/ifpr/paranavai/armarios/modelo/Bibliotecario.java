package br.edu.ifpr.paranavai.armarios.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_bibliotecario")
public class Bibliotecario extends Pessoa implements Serializable{
    private String siape;

    public Bibliotecario() {
        
    }
    public Bibliotecario(String siape, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao){
        super();
    }
    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "siape=" + siape + '}';
    }
    
}