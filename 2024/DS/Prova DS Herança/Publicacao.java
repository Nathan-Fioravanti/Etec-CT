
public class Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
 
    public Publicacao() {}
    // Construtor
    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
 
    // M�todos getters e setters
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public String getAutor() {
        return autor;
    }
 
    public void setAutor(String autor) {
        this.autor = autor;
    }
 
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
 
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
 
    // M�todo exibirDetalhes
    public void exibirDetalhes() {
        System.out.println("T�tulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publica��o: " + anoPublicacao);
    }
}
