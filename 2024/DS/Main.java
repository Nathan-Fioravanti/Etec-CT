
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos valores para o jogo físico (uno)
        System.out.println("Informe o nome do jogo físico:");
        String nomeUno = scanner.nextLine();
        
        System.out.println("Informe o preço do jogo físico:");
        double precoUno = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Informe a distribuidora do jogo físico:");
        String distribuidoraUno = scanner.nextLine();
        
        System.out.println("Informe o tempo da partida do jogo físico:");
        int tempoPUno = scanner.nextInt();
        
        System.out.println("Informe a quantidade de jogadores do jogo físico:");
        int quantJUno = scanner.nextInt();
        
        // Criando objeto jogoFisico com os valores lidos
        jogoFisico uno = new jogoFisico();
        uno.setNome(nomeUno);
        uno.setPreco(precoUno);
        uno.setDistribuidora(distribuidoraUno);
        uno.setTempoP(tempoPUno);
        uno.setQuantJ(quantJUno);
        uno.calcularTempoTotal(7);
        
        // Imprimindo informações do jogo físico
        System.out.println("O nome do jogo é " + uno.getNome());
        System.out.println("O preço dele é " + uno.getPreco());
        System.out.println("Sua distribuidora é " + uno.getDistribuidora());
        System.out.println("O tempo da partida é " + uno.getTempoP());
        System.out.println("A quantidade de jogadores é " + uno.getQuantJ());
        System.out.println("O tempo total de partida é " + uno.calcularTempoTotal(7));
        System.out.println("");
        
        // Leitura dos valores para o jogo eletrônico (fortnite)
        scanner.nextLine();
        
        System.out.println("Informe o nome do jogo eletrônico:");
        String nomeFortnite = scanner.nextLine();
        
        System.out.println("Informe o preço do jogo eletrônico:");
        double precoFortnite = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Informe a distribuidora do jogo eletrônico:");
        String distribuidoraFortnite = scanner.nextLine();
        
        System.out.println("Informe a plataforma do jogo eletrônico:");
        String plataformaFortnite = scanner.nextLine();
        
        System.out.println("Informe o gênero do jogo eletrônico:");
        String generoFortnite = scanner.nextLine();
        
        System.out.println("Informe a quantidade de jogadores para jogar online:");
        int quantJogadoresFortnite = scanner.nextInt();
        
        // Criando objeto jogoEletronico com os valores lidos
        jogoEletronico fortinite = new jogoEletronico();
        fortinite.setNome(nomeFortnite);
        fortinite.setPreco(precoFortnite);
        fortinite.setDistribuidora(distribuidoraFortnite);
        fortinite.setPlataforma(plataformaFortnite);
        fortinite.setGenero(generoFortnite);
        fortinite.jogarOnline(quantJogadoresFortnite);
        
        // Imprimindo informações do jogo eletrônico
        System.out.println("O nome do jogo é " + fortinite.getNome());
        System.out.println("O preço dele é " + fortinite.getPreco());
        System.out.println("Sua distribuidora é " + fortinite.getDistribuidora());
        System.out.println("A plataforma é " + fortinite.getPlataforma());
        System.out.println("O gênero é " + fortinite.getGenero());
        System.out.println("Jogando online com " + fortinite.jogarOnline(quantJogadoresFortnite) + " jogadores");
        
        // Fechando o scanner
        scanner.close();
    }
}
