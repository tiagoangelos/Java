package operadoresaritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*
        int n1 = 5;
        int n2 = 7;
        float media = (n1 + n2) /2;
        
        System.out.println(media);
        */

        /*
        int numero = 1;
        numero++;
        System.out.println(numero);
        */
        
        /*
        int a = 5;
        int b = 2;
        
        a -= b;
        
        System.out.println("valor a: " + a + "\nvalor b: " + b);
        */
         
        /*
        float x = (float) 8.2;
        
        int aredondar = (int) Math.round(x);
        
        System.out.println(aredondar);
        */
        
        double numeroSorteado = 1 + Math.random() * (10 - 1);
        System.out.println(Math.round(numeroSorteado));
    }   
}