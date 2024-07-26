/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptions04;

import classes.Diretor;
import classes.Engenheiro;
import classes.Funcionario;
import classes.FuncionarioException;
import classes.Gerente;
import classes.Secretario;
import java.util.Scanner;

/**
 *
 * @author mylenaantonelli
 */
public class Exceptions04 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Engenheiro engenheiro = new Engenheiro();
        Diretor diretor = new Diretor();
        Secretario secretario = new Secretario();
        Gerente gerente = new Gerente();
        
        Scanner leitor = new Scanner(System.in);
        
        //Funcionario
        try{
            System.out.println("Informe o salario do funcionario: ");
            double salario = leitor.nextDouble();
            funcionario.setSalario(salario);
        }catch (FuncionarioException ex){
            System.out.println(ex.getMessage());
        }
        
        //Engenheiro
        try{
            System.out.println("Informe o salario do engenheiro: ");
            double salario = leitor.nextDouble();
            engenheiro.setSalario(salario);
        }catch (FuncionarioException ex){
            System.out.println(ex.getMessage());
        }
        
        //Diretor
        try{
            System.out.println("Informe o salario do diretor: ");
            double salario = leitor.nextDouble();
            diretor.setSalario(salario);
        }catch (FuncionarioException ex){
            System.out.println(ex.getMessage());
        }
        
        //Secretario
        try{
            System.out.println("Informe o salario do secretario: ");
            double salario = leitor.nextDouble();
            secretario.setSalario(salario);
        }catch (FuncionarioException ex){
            System.out.println(ex.getMessage());
        }
        
        //Gerente
        try{
            System.out.println("Informe o salario do gerente: ");
            double salario = leitor.nextDouble();
            gerente.setSalario(salario);
        }catch (FuncionarioException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
