
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
     // Criando a instância do livro
        Livro livro = new Livro();
 
        // Solicitando informações do livro ao usuário
        System.out.print("Digite o título do livro: ");
        livro.setTitulo(scanner.next());
 
        System.out.print("Digite o autor do livro: ");
        livro.setAutor(scanner.next());
 
        System.out.print("Digite o ano de publicação do livro: ");
        livro.setAnoPublicacao(scanner.nextInt());
 
        System.out.print("Digite o número de páginas do livro: ");
        livro.setNumeroPaginas(scanner.nextInt());
 
        System.out.print("Digite a editora do livro: ");
        livro.setEditora(scanner.next());
 
        // Perguntando ao usuário se deseja incluir a editora na exibição
        System.out.print("Deseja incluir a editora na exibição do livro? (sim/não): ");
        String respostaLivro = scanner.next();
        boolean incluirEditoraLivro = respostaLivro.equalsIgnoreCase("sim");
 
        // Exibindo os detalhes do livro
        System.out.println("\nDetalhes do Livro:");
        livro.exibirDetalhes(incluirEditoraLivro);
 
     // Criando a instância da revista
        Revista revista = new Revista();
        // Solicitando informações da revista ao usuário
        System.out.print("\nDigite o título da revista: ");
        revista.setTitulo(scanner.next());
 
        System.out.print("Digite o autor da revista: ");
        revista.setAutor(scanner.next());
 
        System.out.print("Digite o ano de publicação da revista: ");
        revista.setAnoPublicacao(scanner.nextInt());
 
        System.out.print("Digite o número da edição da revista: ");
        revista.setNumeroEdicao(scanner.nextInt());
 
        System.out.print("Digite o mês de publicação da revista: ");
        revista.setMesPublicacao(scanner.next());
 
        // Perguntando ao usuário se deseja incluir o mês de publicação na exibição
        System.out.print("Deseja incluir o mês de publicação na exibição da revista? (sim/não): ");
        String respostaRevista = scanner.next();
        boolean incluirMesPublicacaoRevista = respostaRevista.equalsIgnoreCase("sim");
 
        // Exibindo os detalhes da revista com ou sem o mês de publicação
        System.out.println("\nDetalhes da Revista:");
        revista.exibirDetalhes(incluirMesPublicacaoRevista);
    }
}
