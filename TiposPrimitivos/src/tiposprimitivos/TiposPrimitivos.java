package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
       String valor = "30";
       int numero = Integer.parseInt(valor);
       System.out.println(numero);
        
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Digite o Nome Do Aluno: ");
       String nome = teclado.nextLine();
      
       System.out.print("Digite a Nota Do Aluno: ");
       float nota =  teclado.nextFloat();
       
       System.out.format("A nota de %s é %.1f \n", nome , nota); 
    }   
}