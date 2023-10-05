package estruturaswitch;

import java.util.Scanner;

public class EstruturaSwitch {
    public static void main(String[] args) {
        Scanner valueTyped = new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("Tipo de Ser");
        System.out.println("===============================");
        
        System.out.print("Quantas pernas possui o ser: ");
        int leg = valueTyped.nextInt();
        String type;
        
        switch(leg) {
            case 1:
                type = "Saci";
            break;
            case 2:
                type = "Bipede";
            break;
            case 3:
                type = "Tripe";
            break;
            case 4:
                type = "Quadrúpede";
            break;
            case 6:
                type = "Aranha";
            break;
            
            default:
                type = "Desconhecido";
        }
        
        System.out.println("-Tipo de ser: " + type);
    }   
}
