
package classes;


public class Secretario extends Funcionario{
    private String linguasFaladas;
    
    public Secretario(){
        super();
        this.linguasFaladas = "";
    }

    public Secretario(String linguasFaladas, String nome, String id, double salario) {
        super(nome, id, salario);
        this.linguasFaladas = linguasFaladas;
    }
    
    public void organizarAgenda(){
        System.out.println("Agenda organizada para o dia!");
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Linguas faladas: " + this.linguasFaladas);
    }
    
    @Override 
    public void setSalario(double salario){
        if(salario <= 0.0){
            throw new FuncionarioException("\"Erro - Salario e menor ou igual a R$0,00");
        }
        this.salario = salario;
    }
    
}
