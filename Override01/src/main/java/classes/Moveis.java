
package classes;

import java.util.Scanner;


public class Moveis extends Produto{
    private String cor;
    private String material;
    
    public Moveis(){
        super();
        this.cor = "";
        this.material = "";
    }

    public Moveis(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }

    public Moveis(String cor, String material, String cod, String nome, double preco, double custo, int estoque) {
        super(cod, nome, preco, custo, estoque);
        this.cor = cor;
        this.material = material;
    }
    
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("--------Informe os dados dos Moveis----------");
        super.preencher();
        System.out.println("Informe a cor: ");
        this.cor = leitor.next();
        System.out.println("Informe o material: ");
        this.material = leitor.next();
    }
    
    public void imprimir(){
        System.out.println("---------Dados dos Moveis----------");
        super.imprimir();
        System.out.println("Cor: " + this.cor);
        System.out.println("Material: " + this.material);
    }
    
    @Override
    public double calcularCustoAdicional(){
        if(this.material == "madeira maciça"){
            return super.custo*0.2;
        }else{
            return super.custo*0.1;
        }
    }
    
    @Override
    public void imprimirDetalhes(){
        super.imprimirDetalhes();
        System.out.println("Material: " + this.material);
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
