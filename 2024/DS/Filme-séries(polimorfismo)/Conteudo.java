public class Conteudo {
    private String categoria;
    private String titulo;
 
    // Construtor
    public Conteudo(String categoria, String titulo) {
        this.categoria = categoria;
        this.titulo = titulo;
    }
 
    // Métodos getters e setters
    public String getCategoria() {
        return categoria;
    }
 
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    // Método descricao
    public void descricao() {
        System.out.println("Categoria: " + categoria + ", Título: " + titulo);
    }
}
