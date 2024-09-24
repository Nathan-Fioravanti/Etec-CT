public class Serie extends Conteudo {
    private int duracao; 
    private int quantEpisodios;
    private int quantTemps;
 
    // Construtor
    public Serie(String titulo, int duracao, int quantEpisodios, int quantTemps) {
        super("Serie", titulo); 
        this.duracao = duracao;
        this.quantEpisodios = quantEpisodios;
        this.quantTemps = quantTemps;
    }
 
    @Override
    public void descricao() {
        System.out.println("Categoria: " + getCategoria() + ", Título: " + getTitulo() +
                ", Duração por episódio: " + duracao + " minutos" +
                ", Episódios: " + quantEpisodios + ", Temporadas: " + quantTemps);
    }
}