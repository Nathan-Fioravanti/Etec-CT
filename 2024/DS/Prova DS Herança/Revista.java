
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
 
    // M�todos getters e setters
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
 
    // Sobrescrita do m�todo
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("N�mero da Edi��o: " + numeroEdicao);
        System.out.println("M�s de Publica��o: " + mesPublicacao);
    }
 
    // Sobrecarga do m�todo com par�metro booleano
    public void exibirDetalhes(boolean incluirMesPublicacao) {
        super.exibirDetalhes();
        System.out.println("N�mero da Edi��o: " + numeroEdicao);
        if (incluirMesPublicacao) {
            System.out.println("M�s de Publica��o: " + mesPublicacao);
        }
    }
 
}