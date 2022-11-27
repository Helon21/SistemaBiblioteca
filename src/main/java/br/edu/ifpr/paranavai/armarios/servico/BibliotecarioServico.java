package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.dao.BibliotecarioDaoImpl;
import br.edu.ifpr.paranavai.armarios.dao.BibliotecarioDao;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import java.util.List;

public class BibliotecarioServico {
    private static BibliotecarioDao dao = new BibliotecarioDaoImpl();

    public static List<Bibliotecario> buscarTodos(){
        return dao.buscarTodos();
    }

    public static Bibliotecario buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static Bibliotecario inserir(Bibliotecario pessoa) {
        return dao.inserir(pessoa);
    }

    public static Bibliotecario atualizar(Bibliotecario pessoa) {
        return dao.atualizar(pessoa);
    }

    public static void excluir(Bibliotecario pessoa) {
        dao.excluir(pessoa);
    }
}
