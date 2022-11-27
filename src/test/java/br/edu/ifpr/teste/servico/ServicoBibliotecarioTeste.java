package br.edu.ifpr.teste.servico;

import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import br.edu.ifpr.paranavai.armarios.servico.BibliotecarioServico;

public class ServicoBibliotecarioTeste {
    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario();
        System.out.println(bibliotecario);
        Bibliotecario bibliotecarioInserido = BibliotecarioServico.inserir(bibliotecario);
        System.out.println(bibliotecarioInserido.toString());
    }

}
