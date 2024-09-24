public class Filme extends Conteudo {
    private int duracao; // duração em minutos
 
    // Construtor
    public Filme(String titulo, int duracao) {
        super("Filme", titulo); // chama o construtor da classe pai
        this.duracao = duracao;
    }
 
    // Método descricao (sobrescreve o da classe pai)
    @Override
    public void descricao() {
        System.out.println("Categoria: " + getCategoria() + ", Título: " + getTitulo() + ", Duração: " + duracao + " minutos");
    }
}
