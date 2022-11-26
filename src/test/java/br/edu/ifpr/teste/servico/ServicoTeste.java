package br.edu.ifpr.teste.servico;

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.servico.LocalizacaoServico;

public class ServicoTeste {
    public static void main(String[] args) {
        Localizacao local = new Localizacao("Biblioteca 18");
        System.out.println(local.toString());
        Localizacao localSalvo = LocalizacaoServico.inserir(local);
        
        System.out.println(localSalvo.toString());
    }
}
