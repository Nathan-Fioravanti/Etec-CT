
public class Produto {
	private String nomeP;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
		if(precoVenda < precoCusto) {
				System.out.println("Cuidado, valor acima do ideal.");		
		}
	}
	public double getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	double calcularMargemLucro() {
			double calcularMargemLucro = precoVenda - precoCusto;
			return calcularMargemLucro;
	}
	
	double getMargemLucroPorcentagem(double getMargemLucroPorcentagem) {
		return calcularMargemLucro()/precoVenda* 100;
	}
}
