
public class Revista extends Publicacao {
    private int numeroEdicao;
    private String mesPublicacao;
 
    public Revista() {}
    // Construtor
    public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao, String mesPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.numeroEdicao = numeroEdicao;
        this.mesPublicacao = mesPublicacao;
    }
 
    // Métodos getters e setters
    public int getNumeroEdicao() {
        return numeroEdicao;
    }
 
    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }
 
    public String getMesPublicacao() {
        return mesPublicacao;
    }
 
    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }
 
    // Sobrescrita do método
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número da Edição: " + numeroEdicao);
        System.out.println("Mês de Publicação: " + mesPublicacao);
    }
 
    // Sobrecarga do método com parâmetro booleano
    public void exibirDetalhes(boolean incluirMesPublicacao) {
        super.exibirDetalhes();
        System.out.println("Número da Edição: " + numeroEdicao);
        if (incluirMesPublicacao) {
            System.out.println("Mês de Publicação: " + mesPublicacao);
        }
    }
 
}