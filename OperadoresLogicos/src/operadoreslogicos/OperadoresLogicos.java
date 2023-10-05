package operadoreslogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int x = 4;
        int y = 7;
        int z = 10;
        
        boolean res;
        
        res = (x < y ^ y < z)?true:false;
        
        System.out.println(res);
    } 
}
