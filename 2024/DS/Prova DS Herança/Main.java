
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
     // Criando a inst�ncia do livro
        Livro livro = new Livro();
 
        // Solicitando informa��es do livro ao usu�rio
        System.out.print("Digite o t�tulo do livro: ");
        livro.setTitulo(scanner.next());
 
        System.out.print("Digite o autor do livro: ");
        livro.setAutor(scanner.next());
 
        System.out.print("Digite o ano de publica��o do livro: ");
        livro.setAnoPublicacao(scanner.nextInt());
 
        System.out.print("Digite o n�mero de p�ginas do livro: ");
        livro.setNumeroPaginas(scanner.nextInt());
 
        System.out.print("Digite a editora do livro: ");
        livro.setEditora(scanner.next());
 
        // Perguntando ao usu�rio se deseja incluir a editora na exibi��o
        System.out.print("Deseja incluir a editora na exibi��o do livro? (sim/n�o): ");
        String respostaLivro = scanner.next();
        boolean incluirEditoraLivro = respostaLivro.equalsIgnoreCase("sim");
 
        // Exibindo os detalhes do livro
        System.out.println("\nDetalhes do Livro:");
        livro.exibirDetalhes(incluirEditoraLivro);
 
     // Criando a inst�ncia da revista
        Revista revista = new Revista();
        // Solicitando informa��es da revista ao usu�rio
        System.out.print("\nDigite o t�tulo da revista: ");
        revista.setTitulo(scanner.next());
 
        System.out.print("Digite o autor da revista: ");
        revista.setAutor(scanner.next());
 
        System.out.print("Digite o ano de publica��o da revista: ");
        revista.setAnoPublicacao(scanner.nextInt());
 
        System.out.print("Digite o n�mero da edi��o da revista: ");
        revista.setNumeroEdicao(scanner.nextInt());
 
        System.out.print("Digite o m�s de publica��o da revista: ");
        revista.setMesPublicacao(scanner.next());
 
        // Perguntando ao usu�rio se deseja incluir o m�s de publica��o na exibi��o
        System.out.print("Deseja incluir o m�s de publica��o na exibi��o da revista? (sim/n�o): ");
        String respostaRevista = scanner.next();
        boolean incluirMesPublicacaoRevista = respostaRevista.equalsIgnoreCase("sim");
 
        // Exibindo os detalhes da revista com ou sem o m�s de publica��o
        System.out.println("\nDetalhes da Revista:");
        revista.exibirDetalhes(incluirMesPublicacaoRevista);
    }
}
