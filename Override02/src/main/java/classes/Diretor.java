
package classes;


public class Diretor extends Funcionario{
    private String areaDeResponsabilidade;
    private double bonusAnual;
    
    public Diretor(){
        super();
        this.areaDeResponsabilidade = "";
        this.bonusAnual = 0.0;
    }

    public Diretor(String areaDeResponsabilidade, double bonusAnual, String nome, String id, double salario) {
        super(nome, id, salario);
        this.areaDeResponsabilidade = areaDeResponsabilidade;
        this.bonusAnual = bonusAnual;
    }
    
    public double calcularBonusAnual(boolean objetivo){
        if(objetivo == true){
            this.bonusAnual = salario*0.2;
            return bonusAnual;
        }else{
            return 0.0;
        }
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Area de Responsabilidade: " + this.areaDeResponsabilidade);
        System.out.println("Bonus Anual: " + this.bonusAnual);
    }
    
    
}
