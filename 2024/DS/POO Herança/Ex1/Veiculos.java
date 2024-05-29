
public class Veiculos {
    	private String marca;
    	private String modelo;
    	private String cor;
    	private int ano;
    	  	
    	
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
    	
    	
		public String exibirMarca() {
    		return getMarca() ; 
    		
    		
    	}
		public int exibirAno() {
    		return getAno() ; 
    		
    		
    	}
		public String exibirModelo() {
    		return getModelo() ; 
    		
    		
    	}
		public String exibirCor() {
    		return getCor() ; 
    		
    		
    	}
		
}

