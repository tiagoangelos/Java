package metodos01;

public class Metodos01 {
    
    static int soma(int a, int b){
        int resultadoSoma = a + b;
    
        return resultadoSoma;
    }
    
    public static void main(String[] args) {
        int res = soma(5, 3);
        System.out.println("A SOMA É IGUAL: " + res);
    } 
}