
package classes;

import java.util.Scanner;


public class Produto {
    protected String cod;
    protected String nome;
    protected double preco;
    protected double custo;
    protected int estoque;
    
    public Produto(){
        this.cod = "";
        this.nome = "";
        this.preco = 0.0;
        this.custo = 0.0;
        this.estoque = 0;
    }

    public Produto(String cod, String nome, double preco, double custo, int estoque) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.custo = custo;
        this.estoque = estoque;
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
        System.out.println("Informe o estoque: ");
        this.estoque = leitor.nextInt();
    }
    
    public void imprimir(){
        System.out.println("Codigo: " + this.cod);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Custo: " + this.custo);
        System.out.println("Estoque: " + this.estoque);
    }
    
    public double calcularDesconto(){
        return this.preco - (this.preco*0.03);
    }
    
    public double calcularCustoAdicional(){
        return this.custo * 0.1;
    }
    
    public boolean verificarEstoque(){
        return true;
    }
    
    public void imprimirDetalhes(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Produto{" + "cod=" + cod + ", nome=" + nome + ", preco=" + preco + ", custo=" + custo + ", estoque=" + estoque + '}';
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

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
}
