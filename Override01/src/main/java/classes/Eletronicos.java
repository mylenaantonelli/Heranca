
package classes;

import java.util.Scanner;


public class Eletronicos extends Produto{
    private String voltagem;
    private double consumoEnergia;
    
    public Eletronicos(){
        super();
        this.voltagem = "";
        this.consumoEnergia = 0.0;
    }

    public Eletronicos(String voltagem, double consumoEnergia, String cod, String nome, double preco, double custo, int estoque) {
        super(cod, nome, preco, custo, estoque);
        this.voltagem = voltagem;
        this.consumoEnergia = consumoEnergia;
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("-------Informe os dados dos Eletronicos--------");
        super.preencher();
        System.out.println("Informe a Voltagem: ");
        this.voltagem = leitor.next();
        System.out.println("Informe o consumo de energia: ");
        this.consumoEnergia = leitor.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("---------Dados dos Eletronicos-------------");
        super.imprimir();
        System.out.println("Voltagem: " + this.voltagem);
        System.out.println("Consumo de Energia: " + this.consumoEnergia);
    }
    
    @Override
    public double calcularDesconto(){
        return super.preco - (super.preco*0.07);
    }
    
    @Override
    public double calcularCustoAdicional(){
        if(this.consumoEnergia > 500){
            return super.custo*0.1;
        }else{
            return 0;
        }
    }
    
    @Override
    public void imprimirDetalhes(){
        super.imprimirDetalhes();
        System.out.println("Consumo de Energia: " + this.consumoEnergia);
    }
    
    public String getVoltagem(){
        return voltagem;
    }
    
    public void setVoltagem(String voltagem){
        this.voltagem = voltagem;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }
    
    
}
