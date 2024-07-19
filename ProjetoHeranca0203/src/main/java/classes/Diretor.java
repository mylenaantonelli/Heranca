
package classes;

import java.util.Scanner;


public class Diretor extends Funcionario{
    private String responsabilidade;
    
    public Diretor(){
        super();
        this.responsabilidade = "";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("-----------Informe os dados do Diretor-----------");
        super.preencher();
        System.out.println("Responsabilidade: ");
        this.responsabilidade = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("---------Dados do Diretor----------");
        super.imprimir();
        System.out.println("Responsabilidade: " + this.responsabilidade);
    }

    public String getResponsabilidade() {
        return responsabilidade;
    }

    public void setResponsabilidade(String responsabilidade) {
        this.responsabilidade = responsabilidade;
    }
    
}
