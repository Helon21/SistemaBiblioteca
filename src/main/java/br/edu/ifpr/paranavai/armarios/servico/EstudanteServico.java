package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.dao.EstudanteDaoImpl;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import java.util.List;
import br.edu.ifpr.paranavai.armarios.dao.EstudanteDao;

public class EstudanteServico {

    private static EstudanteDao dao = new EstudanteDaoImpl();

    public static List<Estudante> buscarTodosEstudantes() {
        return dao.buscarTodos();
    }

    public static Estudante buscarPorId(Integer codigo) {
        return dao.buscarPorId(codigo);
    }

    public static Estudante inserir(Estudante pessoa) {
        return dao.inserir(pessoa);
    }

    public static Estudante atualizar(Estudante pessoa) {
        return dao.atualizar(pessoa);
    }

    public static void excluir(Estudante pessoa) {
        dao.excluir(pessoa);
    }
}
