
package com.mycompany.projetoheranca0203;

import classes.Diretor;
import classes.Engenheiro;
import classes.Funcionario;
import classes.Gerente;


public class ProjetoHeranca0203 {
    
    void alteracao(Funcionario f){
    
    }
    
    void metodoQualquer(Diretor d){
    
    }

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        Engenheiro eng = new Engenheiro();
        Diretor dir = new Diretor();
        
        Funcionario ttt = new Diretor();
        
        alteracao(func);
        alteracao(eng);
        alteracao(dir);
        
        metodoQualquer(func);  //Erro: Funcionario nao pode ser convertido para Diretor
        metodoQualquer(eng);  //Erro: Engenheiro nao pode ser convertido para Diretor
        metodoQualquer(dir);
        
        ttt = new Gerente();
        dir = new Gerente();  //Erro: Gerente nao pode ser um Diretor
        eng = new Gerente();  //Erro: Gerente nao pode ser Engenheiro
        
        
        //Resumindo: O "Pai" nao pode ser tranformado em algum "Filho"
                   // E nem um "Filho" pode ser tranformado em outro "Filho"
                   // Mas um "Filho" pode ser tranformado para o "Pai"
        
    }
}
