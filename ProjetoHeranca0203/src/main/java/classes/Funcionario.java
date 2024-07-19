package classes;

import java.util.Scanner;


public class Funcionario {
    protected String nome;
    protected String id;
    protected int idade;
    protected String cpf;
    
    public Funcionario(){
        this.nome = "";
        this.id = "";
        this.idade = 0;
        this.cpf = "";
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Nome: ");
        this.nome = leitor.next();
        System.out.println("Id: ");
        this.id = leitor.next();
        System.out.println("Idade: ");
        this.idade = leitor.nextInt();
        System.out.println("Cpf: ");
        this.cpf = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Id: " + this.id);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cpf: " + this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
