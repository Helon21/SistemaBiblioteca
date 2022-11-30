package br.edu.ifpr.paranavai.armarios.modelo;

import br.edu.ifpr.paranavai.armarios.dao.EstudanteDao;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="tb_estudante")
public class Estudante extends Pessoa implements Serializable{
    private String ra;
 
    public Estudante(){  
        
    }
    public Estudante(String ra, String nome, String email, String telefone, String senha, boolean ativo){
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
     
}