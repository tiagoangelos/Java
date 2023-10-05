package numeros;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        
        System.out.println("=======================");
        System.out.println("Soma Numeros Enquanto");
        System.out.println("=======================");
        
        Scanner teclado = new Scanner(System.in);
        
        int numero, soma = 0;
        String resposta;
        
        do {
            System.out.print("Digite um numero: ");
            numero = teclado.nextInt();
            
            soma += numero;
            
            System.out.print("-Deseja continuar [S/N]: ");
            resposta = teclado.next();
            
        } while (resposta.equals("S") || resposta.equals("s"));
        
        System.out.println("A soma de todos os valores é: " + soma);
    }
}



