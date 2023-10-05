package estruturafor;

public class EstruturaFor {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 5; contador++){
            System.out.println("For de fora: " + contador);
            
            for(int contador2 = 1; contador2 <= 5; contador2++){
                System.out.println("For de dentro: " + contador2);
            }
        }
    } 
}
