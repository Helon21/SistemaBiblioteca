package br.edu.ifpr.paranavai.armarios.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_armario")
public class Armario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_armario", unique = true, nullable = false)
    private Integer armarioId;
    
    
    @Column(name = "numero", unique = true, nullable = false)
    private Integer numero;
    
    @Column(name = "ativo", unique = true, nullable = false, length = 100)
    private boolean ativo;
    
    @Column(name = "observacoes", unique = true, nullable = false, length = 100)
    private String observacoes;

    public Armario() {
    }

    public Armario(Integer numero, boolean ativo, String observacoes) {
        this.numero = numero;
        this.ativo = ativo;
        this.observacoes = observacoes;
    }

    public Integer getArmarioId() {
        return armarioId;
    }

    public void setArmarioId(Integer armarioId) {
        this.armarioId = armarioId;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
}
