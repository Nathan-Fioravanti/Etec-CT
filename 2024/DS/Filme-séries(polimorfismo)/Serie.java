public class Serie extends Conteudo {
    private int duracao; // duração por episódio em minutos
    private int quantEpisodios;
    private int quantTemps;
 
    // Construtor
    public Serie(String titulo, int duracao, int quantEpisodios, int quantTemps) {
        super("Serie", titulo); // chama o construtor da classe pai
        this.duracao = duracao;
        this.quantEpisodios = quantEpisodios;
        this.quantTemps = quantTemps;
    }
 
    // Método descricao (sobrescreve o da classe pai)
    @Override
    public void descricao() {
        System.out.println("Categoria: " + getCategoria() + ", Título: " + getTitulo() +
                ", Duração por episódio: " + duracao + " minutos" +
                ", Episódios: " + quantEpisodios + ", Temporadas: " + quantTemps);
    }
}