
class Livro extends Publicacao {
    private int numeroPaginas;
    private String editora;
 
    // Construtor padrão
    public Livro() {}
 
    // Construtor com parâmetros
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String editora) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
    }
 
    //getters e setters
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
 
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
 
    public String getEditora() {
        return editora;
    }
 
    public void setEditora(String editora) {
        this.editora = editora;
    }
 
    //Sobrescrita do método
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Páginas: " + getNumeroPaginas());
        System.out.println("Editora: " + getEditora());
    }
    
    //Sobrecarga do método com parâmetro booleano
    public void exibirDetalhes(boolean incluirEditora) {
        super.exibirDetalhes();
        System.out.println("Número de Páginas: " + getNumeroPaginas());
        if (incluirEditora) {
            System.out.println("Editora: " + getEditora());
        }
    }
}