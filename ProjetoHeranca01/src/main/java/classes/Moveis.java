
package classes;

import java.util.Scanner;


public class Moveis extends Produto{
    private String cor;
    
    public Moveis(){
        super();
        this.cor = "";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("--------Informe os dados dos Moveis----------");
        super.preencher();
        System.out.println("Informe a cor: ");
        this.cor = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("---------Dados dos Moveis----------");
        super.imprimir();
        System.out.println("Cor: " + this.cor);
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
}
