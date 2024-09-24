public class Serie extends Conteudo {
    private int duracao; // dura��o por epis�dio em minutos
    private int quantEpisodios;
    private int quantTemps;
 
    // Construtor
    public Serie(String titulo, int duracao, int quantEpisodios, int quantTemps) {
        super("Serie", titulo); // chama o construtor da classe pai
        this.duracao = duracao;
        this.quantEpisodios = quantEpisodios;
        this.quantTemps = quantTemps;
    }
 
    // M�todo descricao (sobrescreve o da classe pai)
    @Override
    public void descricao() {
        System.out.println("Categoria: " + getCategoria() + ", T�tulo: " + getTitulo() +
                ", Dura��o por epis�dio: " + duracao + " minutos" +
                ", Epis�dios: " + quantEpisodios + ", Temporadas: " + quantTemps);
    }
}