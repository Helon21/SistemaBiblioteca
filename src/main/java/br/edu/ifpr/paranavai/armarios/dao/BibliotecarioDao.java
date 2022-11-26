package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import java.util.List;

public interface BibliotecarioDao {
    public List<Bibliotecario> buscarTodos();
    public Bibliotecario buscarPorId(Integer id);
    public Bibliotecario inserir(Bibliotecario pessoa);
    public Bibliotecario atualizar(Bibliotecario pessoa);
    public void excluir(Bibliotecario pessoa);

}
