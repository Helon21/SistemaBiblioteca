package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import java.util.List;
import org.hibernate.Session;

public class BibliotecarioDaoImpl implements BibliotecarioDao{
    
    private Session sessao;

    public BibliotecarioDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Bibliotecario> buscarTodos() {
        List<Bibliotecario> pessoas = null;
        try {
            sessao.beginTransaction();
            pessoas = (List<Bibliotecario>) this.sessao.createQuery("from Bibliotecario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoas;
    }
    
    @Override
    public Bibliotecario buscarPorId(Integer id) {
        Bibliotecario pessoa = null;
        try {
            sessao.beginTransaction();
            pessoa = (Bibliotecario) sessao.get(Bibliotecario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public Bibliotecario inserir(Bibliotecario pessoa) {
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
    public Bibliotecario atualizar(Bibliotecario pessoa) {
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
    public void excluir(Bibliotecario pessoa) {
        try {
            sessao.beginTransaction();
            sessao.delete(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
