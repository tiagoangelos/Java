package operadorternario;

public class OperadorTernario {
    public static void main(String[] args) {
        int n1, n2;
        String r;
        n1 = 6;
        n2 = 3;
        
        r = (n1 > n2)?"verdade":"falso";
        
        System.out.println(r);
    }
}