
public class Main {
		public static void main(String[] args) {
			
			jogoFisico uno = new jogoFisico();
			
			uno.setNome("Uno MERCY");
			uno.setPreco(40);
			uno.setDistribuidora("Estrela");
			uno.setTempoP(20);
			uno.setQuantJ(10);
			uno.calcularTempoTotal(7);
			
			System.out.println("O nome do jogo é "+ uno.getNome());
			System.out.println("O preço dele é "+ uno.getPreco());
			System.out.println("Sua distribuidora é "+ uno.getDistribuidora());
			System.out.println("O tempo da partida é " + uno.getTempoP());
			System.out.println("A quantidade de jogadores é "+ uno.getQuantJ());
			System.out.println("O tempo total de partida é "+ uno.calcularTempoTotal(7));
			System.out.println("");
			
			
			
			
			
			jogoEletronico fortinite = new jogoEletronico();
			fortinite.setNome("Fortine");
			fortinite.setPreco(80);
			fortinite.setDistribuidora("epic games");
			fortinite.setPlataforma("CONSOLE e PC");
			fortinite.setGenero("battleroyale");
			fortinite.jogarOnline(100);
			
			
			System.out.println("O nome do jogo é "+ fortinite.getNome());
			System.out.println("O preço dele é "+ fortinite.getPreco());
			System.out.println("Sua distribuidora é "+ fortinite.getDistribuidora());
			System.out.println("a plataforma é " + fortinite.getPlataforma());
			System.out.println("o genero é " + fortinite.getGenero());
			System.out.println("Jogando online com "+ fortinite.jogarOnline(100) +" jogadores");
		}
	
}
