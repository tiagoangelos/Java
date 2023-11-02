package encapsulamanto;

public class Encapsulamanto {
    public static void main(String[] args) {
        ControleRemoto mypad = new ControleRemoto();
        
        mypad.ligar();
        mypad.maisVolume();
        
        mypad.abrirMenu();
    }  
}