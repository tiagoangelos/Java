package vetor04;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};
        
        for(int contador:vetor) {
            System.out.print(contador + " ");
        }
        
        int searchValue = Arrays.binarySearch(vetor, 1);
        
        System.out.println("\nAchei o Numero na posição: " + searchValue);
    }  
}