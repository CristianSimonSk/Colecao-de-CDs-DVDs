package cds.dvds;

public class CD {
    private String titulo;
    private String artista;
    private String numero;
    private boolean possui;
    private String descricao;
    
    public CD(String titulo, String artista, String numero){
        this.titulo = titulo;
        this.artista = artista;
        this.numero = numero;
        possui = false;
        this.descricao = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getPossui() {
        return possui;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setPossui(boolean possui) {
        this.possui = possui;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public String getNumero() {
        return numero;
    }
    
}
