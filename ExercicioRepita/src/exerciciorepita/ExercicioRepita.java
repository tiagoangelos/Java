package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {
    public static void main(String[] args) {
        int numero;
        int totalValores = -1;
        int totalPares = -1;
        int totalImpares = 0;
        int acimaDeCem = 0;
        int soma = 0;
        int media = 0;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Numero: \n (valor 0 interrompe)"));
            
            if(numero % 2 == 0){
                totalPares++;
            }else{
                totalImpares++;
            }
            
            if(numero > 100){
                acimaDeCem++;
            }
            
            soma += numero;
            totalValores++;
        } while (numero != 0);
        
        media = soma / totalValores;
        
        JOptionPane.showMessageDialog(null, 
                "Resultados\n"
              + "----------------------------------\n"
              + "Total de Valores: " + totalValores + "\n"
              + "Total de Pares: " + totalPares + "\n"
              + "Total de Impares: " + totalImpares + "\n"
              + "Acima de 100: " + acimaDeCem + "\n"
              + "Média dos Valores: " + media + "\n"
              , "Resultados", JOptionPane.WARNING_MESSAGE
        );
    }
}
 //JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vinda!", JOptionPane.WARNING_MESSAGE);