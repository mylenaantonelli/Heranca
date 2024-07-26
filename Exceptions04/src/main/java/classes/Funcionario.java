
package classes;


public class Funcionario {
    protected String nome;
    protected String id;
    protected double salario;
    
    public Funcionario(){
        this.nome = "";
        this.id = "";
        this.salario = 0.0;
    }

    public Funcionario(String nome, String id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }
    
    public double aumentarSalario(){
        return this.salario + (this.salario*0.05);
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Id: " + this.id);
        System.out.println("Salario: " + this.salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", id=" + id + ", salario=" + salario + '}';
    }
    
    public void setSalario(double salario){
        if(salario <= 0.0){
            throw new FuncionarioException("Erro - Salario e menor ou igual a R$0,00");
        }
        this.salario = salario;
    }
}
