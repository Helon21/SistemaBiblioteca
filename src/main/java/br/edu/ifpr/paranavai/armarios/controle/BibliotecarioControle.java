package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import br.edu.ifpr.paranavai.armarios.servico.BibliotecarioServico;
import java.util.List;

public class BibliotecarioControle {
    public static List<Bibliotecario> listarTodosBibliotecarios(){
    return BibliotecarioServico.buscarTodos();
    }
    
    public static Bibliotecario inserir(Bibliotecario pessoa) {
        return BibliotecarioServico.inserir(pessoa);
    }

    public static Bibliotecario buscarPorId(int codigo) {
        return BibliotecarioServico.buscarPorId(codigo);
    }
    public static Bibliotecario atualizar(Bibliotecario pessoa) {
        return BibliotecarioServico.atualizar(pessoa);
    }
    
    public static void excluir (Bibliotecario pessoa) {
        BibliotecarioServico.excluir(pessoa);
    }
    
}
