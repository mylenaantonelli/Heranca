

package com.mycompany.override02;

import classes.Diretor;
import classes.Engenheiro;
import classes.Funcionario;
import classes.Gerente;
import classes.Secretario;


public class Override02 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jose", "01", 3500.0);
        Engenheiro engenheiro = new Engenheiro("Civil", "Luana", "01", 80000.0);
        Diretor diretor = new Diretor("Tecnologia", 0.1, "Maria", "01", 12000.0);
        Secretario secretario = new Secretario("Inglês e Espanhol", "Pedro", "01", 2000.0);
        Gerente gerente = new Gerente(15, "Estela", "01", 11000.0);
        
        funcionario.aumentarSalario();
        engenheiro.aumentarSalario();
        diretor.calcularBonusAnual(true);
        secretario.organizarAgenda();
        gerente.aumentarSalario();


        System.out.println("Engenheiro");
        engenheiro.exibirInformacoes();

        System.out.println("Diretor");
        diretor.exibirInformacoes();
        

        System.out.println("Secretario");
        secretario.exibirInformacoes();
        

        System.out.println("Gerente");
        gerente.exibirInformacoes();
        
    }
}
