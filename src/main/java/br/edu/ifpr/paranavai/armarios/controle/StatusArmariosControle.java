package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import br.edu.ifpr.paranavai.armarios.servico.StatusArmarioServico;
import java.util.List;


public class StatusArmariosControle {
    public static List<Armario> buscarTodos(){
        return StatusArmarioServico.buscarTodos();
    }
    
    public static Armario buscarPorId(int codigo){
        return StatusArmarioServico.buscarPorId(codigo);
    }
    
    public static Armario inserir(Armario armario){
        return StatusArmarioServico.inserir(armario);
    }
    
    public static Armario atualizar(Armario armario){
        return StatusArmarioServico.atualizar(armario);
    }
    
    public static void excluir(Armario armario){
        StatusArmarioServico.excluir(armario);
    } 
    
}
