
package classes;

import java.util.Scanner;


public class Pessoa {
    protected String nome;
    protected char sexo;
    protected int idade;
    
    public Pessoa(){
        this.nome = "";
        this.sexo = ' ';
        this.idade = 0;
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("Sexo: ");
        this.sexo = leitor.next().charAt(0);
        System.out.println("Idade: ");
        this.idade = leitor.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
    }
    
    public String getNome(){
        return nome;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
}
