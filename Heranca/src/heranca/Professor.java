package heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAumento(float valorAumento){
        this.salario += valorAumento;
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public void setSalario(Float salario){
        this.salario = salario;
    }   
    
}