package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.servico.EstudanteServico;
import java.util.List;

public class EstudanteControle {
    public static List<Estudante> listarTodasEstudantes(){
        return EstudanteServico.buscarTodos();
    }
}
