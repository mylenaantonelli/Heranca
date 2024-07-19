
package classes;

import java.util.Scanner;


public class Professor extends Pessoa{
    private String cpf;
    
    public Professor(){
        super();
        this.cpf = "";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("---------Informe os dados do Professor-----------");
        super.preencher();
        System.out.println("Cpf: ");
        this.cpf = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("---------Dados do Professor---------");
        super.imprimir();
        System.out.println("Cpf: " + this.cpf);
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
