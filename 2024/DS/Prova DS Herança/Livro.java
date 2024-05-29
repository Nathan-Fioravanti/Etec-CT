
class Livro extends Publicacao {
    private int numeroPaginas;
    private String editora;
 
    // Construtor padr�o
    public Livro() {}
 
    // Construtor com par�metros
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
 
    //Sobrescrita do m�todo
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("N�mero de P�ginas: " + getNumeroPaginas());
        System.out.println("Editora: " + getEditora());
    }
    
    //Sobrecarga do m�todo com par�metro booleano
    public void exibirDetalhes(boolean incluirEditora) {
        super.exibirDetalhes();
        System.out.println("N�mero de P�ginas: " + getNumeroPaginas());
        if (incluirEditora) {
            System.out.println("Editora: " + getEditora());
        }
    }
}