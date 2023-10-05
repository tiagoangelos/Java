package vetor05;

import java.util.Arrays;

public class Vetor05 {
    public static void main(String[] args) {
        int vetor[] = new int[20];
        
        Arrays.fill(vetor, 10);
        
        for(int i: vetor){
            System.out.println(i);
        }
    } 
}