public class Filme extends Conteudo {
    private int duracao; // dura��o em minutos
 
    // Construtor
    public Filme(String titulo, int duracao) {
        super("Filme", titulo); // chama o construtor da classe pai
        this.duracao = duracao;
    }
 
    // M�todo descricao (sobrescreve o da classe pai)
    @Override
    public void descricao() {
        System.out.println("Categoria: " + getCategoria() + ", T�tulo: " + getTitulo() + ", Dura��o: " + duracao + " minutos");
    }
}
