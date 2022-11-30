package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import java.util.List;
import org.hibernate.Session;

public class EstudanteDaoImpl implements EstudanteDao {

    private Session sessao;

    public EstudanteDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Estudante> buscarTodos() {
        List<Estudante> pessoas = null;
        try {
            sessao.beginTransaction();
            pessoas = (List<Estudante>) this.sessao.createQuery("from Estudante").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoas;
    }
    
    @Override
    public Estudante buscarPorId(Integer id) {
        Estudante pessoa = null;
        try {
            sessao.beginTransaction();
            pessoa = (Estudante) sessao.get(Estudante.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public Estudante inserir(Estudante pessoa) {
        try {
            sessao.beginTransaction();
            sessao.persist(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public Estudante atualizar(Estudante pessoa) {
        try {
            sessao.beginTransaction();
            sessao.update(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public void excluir(Estudante pessoa) {
        try {
            sessao.beginTransaction();
            sessao.delete(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
