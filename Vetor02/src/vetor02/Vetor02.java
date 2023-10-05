package vetor02;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"Jan","Fev","Mar","Abr","Mai",
            "Jun","Jul","Ago","Set","Out","Nov","Dez",};
        
        int total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 , 31};
        
        System.out.println("---------------------");
        System.out.println("DIAS DO MÊS");
        System.out.println("---------------------");
        
        for(int contador = 0; contador < mes.length; contador++){
            System.out.println("O Mês de " + mes[contador] + " Têm " + total[contador] + " Dias!");
        }
    }
}