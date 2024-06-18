
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos valores para o jogo f�sico (uno)
        System.out.println("Informe o nome do jogo f�sico:");
        String nomeUno = scanner.nextLine();
        
        System.out.println("Informe o pre�o do jogo f�sico:");
        double precoUno = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Informe a distribuidora do jogo f�sico:");
        String distribuidoraUno = scanner.nextLine();
        
        System.out.println("Informe o tempo da partida do jogo f�sico:");
        int tempoPUno = scanner.nextInt();
        
        System.out.println("Informe a quantidade de jogadores do jogo f�sico:");
        int quantJUno = scanner.nextInt();
        
        // Criando objeto jogoFisico com os valores lidos
        jogoFisico uno = new jogoFisico();
        uno.setNome(nomeUno);
        uno.setPreco(precoUno);
        uno.setDistribuidora(distribuidoraUno);
        uno.setTempoP(tempoPUno);
        uno.setQuantJ(quantJUno);
        uno.calcularTempoTotal(7);
        
        // Imprimindo informa��es do jogo f�sico
        System.out.println("O nome do jogo � " + uno.getNome());
        System.out.println("O pre�o dele � " + uno.getPreco());
        System.out.println("Sua distribuidora � " + uno.getDistribuidora());
        System.out.println("O tempo da partida � " + uno.getTempoP());
        System.out.println("A quantidade de jogadores � " + uno.getQuantJ());
        System.out.println("O tempo total de partida � " + uno.calcularTempoTotal(7));
        System.out.println("");
        
        // Leitura dos valores para o jogo eletr�nico (fortnite)
        scanner.nextLine();
        
        System.out.println("Informe o nome do jogo eletr�nico:");
        String nomeFortnite = scanner.nextLine();
        
        System.out.println("Informe o pre�o do jogo eletr�nico:");
        double precoFortnite = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Informe a distribuidora do jogo eletr�nico:");
        String distribuidoraFortnite = scanner.nextLine();
        
        System.out.println("Informe a plataforma do jogo eletr�nico:");
        String plataformaFortnite = scanner.nextLine();
        
        System.out.println("Informe o g�nero do jogo eletr�nico:");
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
        
        // Imprimindo informa��es do jogo eletr�nico
        System.out.println("O nome do jogo � " + fortinite.getNome());
        System.out.println("O pre�o dele � " + fortinite.getPreco());
        System.out.println("Sua distribuidora � " + fortinite.getDistribuidora());
        System.out.println("A plataforma � " + fortinite.getPlataforma());
        System.out.println("O g�nero � " + fortinite.getGenero());
        System.out.println("Jogando online com " + fortinite.jogarOnline(quantJogadoresFortnite) + " jogadores");
        
        // Fechando o scanner
        scanner.close();
    }
}
