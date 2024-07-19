
package classes;

import java.util.Scanner;


public class Perecivel extends Produto{
    private double peso;
    private int tempoParaVencer;
    
    public Perecivel(){
        super();
        this.peso = 0.0;
        this.tempoParaVencer = 0;
    }

    public Perecivel(double peso, int tempoParaVencer, String cod, String nome, double preco, double custo, int estoque) {
        super(cod, nome, preco, custo, estoque);
        this.peso = peso;
        this.tempoParaVencer = tempoParaVencer;
    }
    
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("-------------Informe os dados do Perecivel----------");
        super.preencher();
        System.out.println("Informe o peso: ");
        this.peso = leitor.nextDouble();
        System.out.println("Informe o tempo para vencer em dias: ");
        this.tempoParaVencer = leitor.nextInt();
    }
    
    public void imprimir(){
        System.out.println("-----------Dados do Perecivel------------");
        super.imprimir();
        System.out.println("Peso: " + this.peso);
        System.out.println("Tempo para vencer: " + this.tempoParaVencer);
    }
    
    @Override
    public double calcularCustoAdicional(){
        if(this.tempoParaVencer <= 7){
            return super.custo*0.3;
        }else if(this.tempoParaVencer <= 15){
            return super.custo*0.15;
        }
        
        return 0;
    }
    
    @Override
    public boolean verificarEstoque(){
        return super.verificarEstoque() && this.tempoParaVencer > 0;
    }
    
    @Override
    public void imprimirDetalhes(){
        super.imprimirDetalhes();
        System.out.println("Dias para Vencer: " + this.tempoParaVencer);
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setTempoParaVencer(int tempoParaVencer) {
        this.tempoParaVencer = tempoParaVencer;
    }

    public int getTempoParaVencer() {
        return tempoParaVencer;
    }
    
    
}
