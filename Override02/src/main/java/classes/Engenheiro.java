
package classes;


public class Engenheiro extends Funcionario{
    private String areaDeEspecializacao;
    
    public Engenheiro(){
        super();
        this.areaDeEspecializacao = "";
    }

    public Engenheiro(String areaDeEspecializacao, String nome, String id, double salario) {
        super(nome, id, salario);
        this.areaDeEspecializacao = areaDeEspecializacao;
    }
    
    @Override
    public double aumentarSalario(){
        return super.salario + (super.salario*0.1);
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Area de Especializacao: " + this.areaDeEspecializacao);
    }
}
