
public class Carro extends Veiculos{

	private int quantidadePortas;
			
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
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
	public int exibirquantidadePortas() {
		return getQuantidadePortas() ; 
		
	}
	
}
