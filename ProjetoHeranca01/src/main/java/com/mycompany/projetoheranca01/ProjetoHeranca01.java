
package com.mycompany.projetoheranca01;

import classes.Eletronicos;
import classes.Moveis;
import classes.Perecivel;
import classes.Produto;


public class ProjetoHeranca01 {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        Eletronicos e1 = new Eletronicos();
        Moveis m1 = new Moveis();
        Perecivel pe1 = new Perecivel();
        
        m1.preencher();
        m1.imprimir();
    }
}
