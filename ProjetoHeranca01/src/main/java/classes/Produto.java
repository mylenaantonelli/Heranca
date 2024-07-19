
package classes;

import java.util.Scanner;


public class Produto {
    protected String cod;
    protected String nome;
    protected double preco;
    protected double custo;
    
    public Produto(){
        this.cod = "";
        this.nome = "";
        this.preco = 0.0;
        this.custo = 0.0;
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o codigo: ");
        this.cod = leitor.next();
        System.out.println("Informe o nome: ");
        this.nome = leitor.next();
        System.out.println("Informe o preço: ");
        this.preco = leitor.nextDouble();
        System.out.println("Informe o custo: ");
        this.custo = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("Codigo: " + this.cod);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Custo: " + this.custo);
    }
    
    public String getCod(){
        return cod;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public double getCusto(){
        return custo;
    }
    
    public void setCod(String cod){
        this.cod = cod;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setCusto(double custo){
        this.custo = custo;
    }
}
