package informacaodosistema;

import java.util.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class InformacaoDoSistema {
    public static void main(String[] args) {
        System.out.println("_________________________");
        System.out.println(" Informação Do Sistema   ");
        System.out.println("_________________________");
        
        Locale infoSystem = Locale.getDefault();
        Date dateSystem = new Date();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        
        String language = infoSystem.getDisplayLanguage();
        String country = infoSystem.getDisplayCountry();
        String date = dateSystem.toString();
        int width = (int) screen.getWidth();
        int height = (int) screen.getHeight();
        
        System.out.println("Idioma: " + language + ", " + country);
        System.out.println("Data: " + date);
        System.out.println("Resolução: " + width + "x" + height);
    }
}