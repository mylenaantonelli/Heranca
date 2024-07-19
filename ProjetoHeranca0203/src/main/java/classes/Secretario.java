
package classes;

import java.util.Scanner;


public class Secretario extends Funcionario{
    private String habilidade;
    
    public Secretario(){
        super();
        this.habilidade = "";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("---------Informe os dados do Secretario-----------");
        super.preencher();
        System.out.println("Habilidade: ");
        this.habilidade = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("----------Dados do Secretario-----------");
        super.imprimir();
        System.out.println("Habilidade: " + this.habilidade);
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }    
}
