package polimorfismosobreposicao;

public class Cachorro extends Mamifero{
    
    @Override
    public void emitirSom() {
        System.out.println("-Latindo");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando ossso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando Rabo");
    }
}