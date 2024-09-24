public class Filme extends Conteudo {
    private int duracao; 
 
    // Construtor
    public Filme(String titulo, int duracao) {
        super("Filme", titulo); 
        this.duracao = duracao;
    }
 
    @Override
    public void descricao() {
        System.out.println("Categoria: " + getCategoria() + ", T�tulo: " + getTitulo() + ", Dura��o: " + duracao + " minutos");
    }
}
