
public class Main {
		public static void main(String[] args) {
			
			jogoFisico uno = new jogoFisico();
			
			uno.setNome("Uno MERCY");
			uno.setPreco(40);
			uno.setDistribuidora("Estrela");
			uno.setTempoP(20);
			uno.setQuantJ(10);
			uno.calcularTempoTotal(7);
			
			System.out.println("O nome do jogo � "+ uno.getNome());
			System.out.println("O pre�o dele � "+ uno.getPreco());
			System.out.println("Sua distribuidora � "+ uno.getDistribuidora());
			System.out.println("O tempo da partida � " + uno.getTempoP());
			System.out.println("A quantidade de jogadores � "+ uno.getQuantJ());
			System.out.println("O tempo total de partida � "+ uno.calcularTempoTotal(7));
			System.out.println("");
			
			
			
			
			
			jogoEletronico fortinite = new jogoEletronico();
			fortinite.setNome("Fortine");
			fortinite.setPreco(80);
			fortinite.setDistribuidora("epic games");
			fortinite.setPlataforma("CONSOLE e PC");
			fortinite.setGenero("battleroyale");
			fortinite.jogarOnline(100);
			
			
			System.out.println("O nome do jogo � "+ fortinite.getNome());
			System.out.println("O pre�o dele � "+ fortinite.getPreco());
			System.out.println("Sua distribuidora � "+ fortinite.getDistribuidora());
			System.out.println("a plataforma � " + fortinite.getPlataforma());
			System.out.println("o genero � " + fortinite.getGenero());
			System.out.println("Jogando online com "+ fortinite.jogarOnline(100) +" jogadores");
		}
	
}
