package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.dao.ArmarioDaoImpl;
import br.edu.ifpr.paranavai.armarios.dao.ArmarioDao;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.util.List;

public class StatusArmarioServico {
    private static ArmarioDao dao = new ArmarioDaoImpl();
    
    public static List<Armario> buscarTodos(){
        return dao.buscarTodos();
    }
    
    public static Armario buscarPorId(Integer id){
        return dao.buscarPorId(id);
    }
    
    public static Armario inserir(Armario armario){
        return dao.inserir(armario);
    }
    
    public static Armario atualizar(Armario armario){
        return dao.atualizar(armario);
    }
    
    public static void excluir(Armario armario){
        dao.excluir(armario);
    }
}
