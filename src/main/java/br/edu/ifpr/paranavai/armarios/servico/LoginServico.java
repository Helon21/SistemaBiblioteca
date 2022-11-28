/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.visao.EditorLoginUI;

/**
 *
 *
 *
 * @author Aluno
 */
public class LoginServico {

    public static boolean verifica(String email, String senha) {
        if (email.equals("admin@admin.com")) {
            if (senha.equals("12345")) {
                return true;
            }
            System.out.println("Senha Inválida");
            return false;
        }
        System.out.println("E-mail Inválido!");
        return false;
    }
    public static boolean verificaAluno(String email, String senha){
        if(email.equals("aluno@aluno.com")){
            if(senha.equals("12345")){
                return true;
            }
            System.out.println("Senha Inválida");
            return false;
        }
        System.out.println("E-mail Inválido!");
        return false;
    }
}
