package fatorialclasses;

public class Fatorial {
    private int num = 0;
    private int fatorial = 1;
    private String formula = "";
    
    public void setValor(int n) {
        num = n;
        int fat = 1;
        String form = "";
        
        for(int c = n; c > 1; c--){
            fat *= c;
            form += c + " x ";
        }
        
        form += "1 = ";
        fatorial = fat;
        formula = form;
    }
    
    public int getFatorial(){
        return fatorial;
    }
    
    public String getFormula(){
        return formula;
    }
}