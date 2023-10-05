package vetor01;

public class Vetor01 {
    public static void main(String[] args) {
        int vetor[] = {3, 5, 3, 4, 10};
        
        for(int contador = 0; contador <= (vetor.length -1) ; contador++){
            System.out.println("POSIÇÃO [" + (contador+1) + "°]: " + vetor[contador]);
        }
    }   
}