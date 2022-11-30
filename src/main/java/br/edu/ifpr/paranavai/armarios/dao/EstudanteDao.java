package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;

public interface EstudanteDao {
    public List<Estudante> buscarTodos();
    public Estudante buscarPorId(Integer id);
    public Estudante inserir(Estudante pessoa);
    public Estudante atualizar(Estudante pessoa);
    public void excluir(Estudante pessoa);
}
