package fatorialclasses;

import fatorialclasses.Fatorial;

public class FatorialClases {
    public static void main(String[] args) {
        Fatorial fat = new Fatorial();
        fat.setValor(6);
        System.out.println("fatorial de 6: " + fat.getFormula() + fat.getFatorial());
    }
}