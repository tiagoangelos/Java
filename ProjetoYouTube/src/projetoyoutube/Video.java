package projetoyoutube;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtida;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtida = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int mediaAvaliacao;
        mediaAvaliacao = (this.avaliacao + avaliacao) / this.views;
                
        this.avaliacao = mediaAvaliacao;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtida() {
        return this.curtida;
    }

    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    @Override
    public void play(){
        this.reproduzindo = true;
    };
    
    @Override
    public void pause(){
        this.reproduzindo = false;
    };
    
    @Override
    public void like(){
        this.curtida++;
    };

    @Override
    public String toString() {
        return "Video{" + "titulo=" + this.titulo + ", avaliacao=" + this.avaliacao + ", views=" + this.views + ", curtida=" + this.curtida + ", reproduzindo=" + this.reproduzindo + '}';
    }
}