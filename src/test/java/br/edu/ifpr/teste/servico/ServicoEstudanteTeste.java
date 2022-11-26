package br.edu.ifpr.teste.servico;

import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.servico.EstudanteServico;

public class ServicoEstudanteTeste {
    public static void main(String[] args){
        Estudante estudante = new Estudante("14145");
        System.out.println(estudante.toString());
        Estudante estudanteInserido = EstudanteServico.inserir(estudante);
        System.out.println(estudanteInserido.toString());
    }
}
