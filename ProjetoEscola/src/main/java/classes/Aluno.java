
package classes;

import java.util.Scanner;


public class Aluno extends Pessoa{
    private String matricula;
    private int anoIngresso;
    
    public Aluno(){
        super();
        this.matricula = "";
        this.anoIngresso = 0;
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("----------Informe os dados do Aluno--------");
        super.preencher();
        System.out.println("Matricula: ");
        this.matricula = leitor.next();
        System.out.println("Ano de Ingresso: ");
        this.anoIngresso = leitor.nextInt();
    
    }
    
    public void imprimir(){
        System.out.println("-----------Dados do Aluno----------");
        super.imprimir();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Ano de Ingresso: " + this.anoIngresso);
    
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}
