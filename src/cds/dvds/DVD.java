package cds.dvds;

public class DVD {
    
    private String titulo;
    private String diretor;
    private String duracao;
    private String descricao;
    private boolean possui;

    
    public DVD(String titulo, String diretor, String duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
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
    public String getDiretor() {
        return diretor;
    }

    public String getTempoDuracao() {
        return duracao;
    }
    
    public void setPossui(boolean possui) {
        this.possui = possui;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    String getDuracao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
