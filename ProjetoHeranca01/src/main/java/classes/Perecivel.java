
package classes;

import java.util.Scanner;


public class Perecivel extends Produto{
    private double peso;
    
    public Perecivel(){
        super();
        this.peso = 0.0;
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("-------------Informe os dados do Perecivel----------");
        super.preencher();
        System.out.println("Informe o peso: ");
        this.peso = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("-----------Dados do Perecivel------------");
        super.imprimir();
        System.out.println("Peso: " + this.peso);
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
}
