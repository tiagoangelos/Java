package polimorfismosobreposicao;

public abstract class Animal {
    
    protected int peso;
    protected int idade;
    protected int membros;

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return this.membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public void dadosAnimal() {
        System.out.println(
               "-------------------------- \n"
             + "Dados Animal: \n"
             + "-------------------------- \n"
             + "Peso: " + this.peso + " K/G \n"
             + "Idade: " + this.idade + " Anos \n"
             + "Membros: " + this.membros);
    }
       
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}