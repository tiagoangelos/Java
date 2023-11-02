package projetoyoutube;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula teorica Java Poo");
        v[1] = new Video("Aula pratica Java Poo");
           
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Tiago", 20, "M", "@tiago_");
        g[1] = new Gafanhoto("Ana", 18, "F", "@Ana_");
        
        Vizualizacao viz[] = new Vizualizacao[3];
        viz[0] = new Vizualizacao(g[0], v[1]);
        viz[0].avaliar(10);
        
        viz[1] = new Vizualizacao(g[1], v[0]);
        viz[1].avaliar();
        
        System.out.println(viz[0].toString());
        System.out.println(viz[1].toString());
    }  
}








