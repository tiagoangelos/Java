package polimorfismosobrecarga;

public class PolimorfismoSobrecarga {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.emitirSom();
        c.reagir("toma comida");
        c.reagir(true);
        c.reagir(4, 35);
        c.reagir(16, 30);
    }   
}