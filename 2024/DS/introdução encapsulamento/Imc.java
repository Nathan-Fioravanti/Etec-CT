
public class Imc {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}

	
	 String indice(String valor) {
		
			double  indice = peso/(altura*altura);
			if (indice < 18.4) {
				return nome+" você está abaixo do peso";
			}else if(indice <= 24.9) {
				return nome+" você está no peso normal";
			}else if(indice <=29.9) {
				return nome+" você está em sobrepeso";
			}else if(indice <= 34.9 ) {
				return nome+" você está em obesidade grau 1";
			}else if( indice <= 39.9) {
				return nome+" você está em obesidade grau 2";
			}else if(indice >=40) {
				return nome+" você está em obesidade grau 3";
			}
			return "Erro: valor invalido";
			
			
	}

	
	 
	 
}
