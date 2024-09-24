import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Conteudo> catalogo = new ArrayList<>();
        
        while (true) {
            System.out.println("Deseja adicionar um filme ou uma série? (f/s) ou 'sair' para encerrar:");
            String escolha = scanner.nextLine();
            
            if (escolha.equalsIgnoreCase("sair")) {
                break;
            }
            
            if (escolha.equalsIgnoreCase("f")) {
                System.out.print("Título do filme: ");
                String titulo = scanner.nextLine();
                System.out.print("Duração do filme (em minutos): ");
                String duracaoStr = scanner.nextLine();
                catalogo.add(new Filme(titulo, Integer.parseInt(duracaoStr)));
            } else if (escolha.equalsIgnoreCase("s")) {
                System.out.print("Título da série: ");
                String titulo = scanner.nextLine();
                System.out.print("Duração por episódio (em minutos): ");
                String duracaoStr = scanner.nextLine();
                System.out.print("Quantidade de episódios: ");
                String quantEpisodiosStr = scanner.nextLine();
                System.out.print("Quantidade de temporadas: ");
                String quantTempsStr = scanner.nextLine();
                catalogo.add(new Serie(titulo, Integer.parseInt(duracaoStr),
                        Integer.parseInt(quantEpisodiosStr), Integer.parseInt(quantTempsStr)));
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        System.out.println("\nCatálogo:");
        for (Conteudo conteudo : catalogo) {
            conteudo.descricao();
        }

        scanner.close();
    }
}
