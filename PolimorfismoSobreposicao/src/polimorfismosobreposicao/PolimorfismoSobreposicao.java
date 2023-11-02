package polimorfismosobreposicao;

public class PolimorfismoSobreposicao {
    public static void main(String[] args) {
        Mamifero ma = new Mamifero();
        Repetil re = new Repetil();
        Peixe pe = new Peixe();
        Ave av = new Ave();
        Canguru can = new Canguru();
        Cachorro cac = new Cachorro();
        Cobra cob = new Cobra();
        Tartaruga tar = new Tartaruga();
        GoldFish gol = new GoldFish();
        Arara ara = new Arara();
        
        ma.setPeso(38);
        ma.setIdade(4);
        ma.setMembros(4);
        ma.dadosAnimal();
        ma.locomover();
        ma.alimentar();
        ma.emitirSom();
        
        /* 
        can.setPeso(38);
        can.setIdade(4);
        can.setMembros(4);
        can.dadosAnimal();
        can.locomover();
        can.alimentar();
        can.emitirSom();
        can.usarBolsa();
        */
        
        /*
        cac.setPeso(38);
        cac.setIdade(4);
        cac.setMembros(4);
        cac.dadosAnimal();
        cac.locomover();
        cac.alimentar();
        cac.emitirSom();
        cac.enterrarOsso();
        cac.abanarRabo();
        */
        
        /*
        tar.setPeso(38);
        tar.setIdade(4);
        tar.setMembros(4);
        tar.dadosAnimal();
        tar.locomover();
        tar.alimentar();
        tar.emitirSom();
        */
        
    }
}