package potenciacao;

import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        Scanner readValue = new Scanner(System.in);
        
        int base, expoente, contador, potencia;
        
        System.out.println("______________________");
        System.out.println("Pontenciação");
        System.out.println("______________________");
        
        System.out.print("Informe a Base: ");
        base = readValue.nextInt();
        
        System.out.print("Informe o Expoente: ");
        expoente = readValue.nextInt();
        
        contador = 1;
        potencia = 1;
        
        while(contador <= expoente){
            potencia = potencia * base;
            
            contador +=1;
        }
        
        System.out.println("- A potencia de: [" + base + "^" + expoente + "] é igual: " + potencia);
    } 
}
