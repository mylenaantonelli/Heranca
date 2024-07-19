
package classes;

import java.util.Scanner;


public class Gerente extends Funcionario{
    private String equipeQueGesta;
    
    public Gerente(){
        super();
        this.equipeQueGesta = "";
    }
    
    public void preencher(){
        Scanner leitor =  new Scanner(System.in);
        
        System.out.println("-----------Informe os dados do Gerente----------");
        super.preencher();
        System.out.println("Equipe que gesta: ");
        this.equipeQueGesta = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("-----------Dados do Gerente---------");
        super.imprimir();
        System.out.println("Equipe que gesta: " + this.equipeQueGesta);
    }

    public String getEquipeQueGesta() {
        return equipeQueGesta;
    }

    public void setEquipeQueGesta(String equipeQueGesta) {
        this.equipeQueGesta = equipeQueGesta;
    }
    
}
