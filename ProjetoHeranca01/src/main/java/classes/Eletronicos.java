
package classes;

import java.util.Scanner;


public class Eletronicos extends Produto{
    private String voltagem;
    
    public Eletronicos(){
        super();
        this.voltagem = "";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("-------Informe os dados dos Eletronicos--------");
        super.preencher();
        System.out.println("Informe a Voltagem: ");
        this.voltagem = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("---------Dados dos Eletronicos-------------");
        super.imprimir();
        System.out.println("Voltagem: " + this.voltagem);
    }
    
    public String getVoltagem(){
        return voltagem;
    }
    
    public void setVoltagem(String voltagem){
        this.voltagem = voltagem;
    }
}
