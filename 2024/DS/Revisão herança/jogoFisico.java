
public class jogoFisico extends jogo {
 
			private int quantJ;
			private int tempoP;
			
			public jogoFisico() {
				
			}
			
			public jogoFisico (String nome, double preco, String distribuidora, int quantJ, int tempoP) {
				super(nome, preco, distribuidora);
				this.quantJ = quantJ;
				this.tempoP= tempoP;
			}
			
			public int getQuantJ() {
				return quantJ;
			}
			public void setQuantJ(int quantJ) {
				this.quantJ = quantJ;
			}
			public double getTempoP() {
				return tempoP;
			}
			public void setTempoP(int tempoP) {
				this.tempoP = tempoP;
			}
			
			public int calcularTempoTotal(int quantidadePartidas) {
				int	tempoTotal = quantidadePartidas * tempoP;
				return tempoTotal;
				
	}
}
