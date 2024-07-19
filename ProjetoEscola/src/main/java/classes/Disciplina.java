
package classes;

import java.util.Scanner;


public class Disciplina {
    private String nome;
    private int semestre;
    private String horario;
    
    public Disciplina(){
        this.nome = "";
        this.semestre = 0;
        this.horario = "";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("--------Informe os dados da Disciplina---------");
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("Semestre: ");
        this.semestre = leitor.nextInt();
        System.out.println("Horario: ");
        this.horario = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("----------Dados da Disciplina----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Semestre: " + this.semestre);
        System.out.println("Horario: " + this.horario);
    }

    public String getNome() {
        return nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
