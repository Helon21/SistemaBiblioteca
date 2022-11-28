package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;

public interface ArmarioDao {
    public List<Armario> buscarTodos();
    public Armario buscarPorId(Integer id);
    public Armario inserir(Armario armario);
    public Armario atualizar(Armario armario);
    public void excluir(Armario armario);
}
