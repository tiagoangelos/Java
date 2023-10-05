package estruturaderepeticao;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        int contador = 0;
        
        while(contador <= 10){
            contador++;
            if(contador == 9){
                break;
            }
            System.out.println(contador);
        }
    }
}