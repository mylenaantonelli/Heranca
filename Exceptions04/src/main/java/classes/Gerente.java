
package classes;


public class Gerente extends Funcionario{
    private int equipeSize;
    
    public Gerente(){
        super();
        this.equipeSize = 0;
    }

    public Gerente(int equipeSize, String nome, String id, double salario) {
        super(nome, id, salario);
        this.equipeSize = equipeSize;
    }
    
    @Override
    public double aumentarSalario(){
        return super.salario + (0.05 + (0.005*this.equipeSize));
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Tamanho da equipe: " + this.equipeSize);
    }
    
    @Override 
    public void setSalario(double salario){
        if(salario <= 0.0){
            throw new FuncionarioException("\"Erro - Salario e menor ou igual a R$0,00");
        }
        this.salario = salario;
    }
}
