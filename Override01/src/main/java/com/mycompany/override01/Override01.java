
package com.mycompany.override01;

import classes.Eletronicos;
import classes.Moveis;
import classes.Perecivel;

public class Override01 {

    public static void main(String[] args) {
       
        Eletronicos eletronico = new Eletronicos("50v", 400, "01", "Celular", 1200, 500, 30);
        Moveis movel = new Moveis("preto", "madeira maciça", "01", "criado", 200, 50, 10);
        Perecivel perecivel = new Perecivel(2.5, 5, "01", "feijao", 3.0, 8.0, 100);

        eletronico.imprimirDetalhes();
        System.out.println("Desconto: " + eletronico.calcularDesconto() 
									       + ", Custo Adicional: " + eletronico.calcularCustoAdicional() + "\n");

        movel.imprimirDetalhes();
        System.out.println("Custo Adicional: " + movel.calcularCustoAdicional() + "\n");

        perecivel.imprimirDetalhes();
        System.out.println("Estoque: " + perecivel.verificarEstoque() 
								         + ", Custo Adicional: " + perecivel.calcularCustoAdicional());
    }
}
