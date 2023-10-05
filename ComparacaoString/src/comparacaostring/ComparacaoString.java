package comparacaostring;

public class ComparacaoString {    
    public static void main(String[] args){
        String nome1 = "Tiago";
        String nome2 = "Tiago";
        String nome3 = new String("Tiago");
        String res;
        
        res = (nome1.equals(nome3))?"igual":"diferente";
        
        System.out.println(res);
    }
}