
public class Moto extends Veiculos{
     private double cilindrada;

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	
	@Override
	public String exibirMarca() {
		return super.getMarca() ; 
		
	}
	@Override
	public int exibirAno() {
		return super.getAno() ; 
		
		
	}
	@Override
	public String exibirModelo() {
		return super.getModelo() ; 
		
		
	}
	@Override
	public String exibirCor() {
		return super.getCor() ; 
		
	}
	public double exibirCilindrada() {
		return getCilindrada() ; 
		
	}
     
}
