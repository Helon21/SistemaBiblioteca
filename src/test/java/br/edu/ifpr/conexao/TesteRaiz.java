/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.conexao;

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.dao.LocalizacaoDao;
import br.edu.ifpr.paranavai.armarios.dao.LocalizacaoDaoImpl;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class TesteRaiz {
    public static void main(String[] args) {
        LocalizacaoDao dao = new LocalizacaoDaoImpl();   
        
        List<Localizacao> lista = dao.buscarTodos();
        
        for (Localizacao localizacao : lista) {
            System.out.println(localizacao.toString());
        }
    
    }
}
