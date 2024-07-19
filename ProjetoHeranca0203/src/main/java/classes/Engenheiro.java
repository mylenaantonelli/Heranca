
package classes;

import java.util.Scanner;


public class Engenheiro extends Funcionario{
    private String especializacao;
    
    public Engenheiro(){
        super();
        this.especializacao = "";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("--------Informe os dados do Engenheiro--------");
        super.preencher();
        System.out.println("Especializaçao: ");
        this.especializacao = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("----------Dados do Engenheiro-----------");
        super.imprimir();
        System.out.println("Especializaçao: " + this.especializacao);
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
