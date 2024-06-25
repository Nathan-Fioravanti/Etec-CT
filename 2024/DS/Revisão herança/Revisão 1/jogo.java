
public class jogo {
       private String nome;
       private double preco;
       private String distribuidora;
       
       public jogo() {
    	   
       }
       
     public jogo(String nome, double preco, String distribuidora) {
    	 this.nome=nome;
    	 this.preco =preco;
    	 this.distribuidora = distribuidora;
     }
       
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	
	public void exibirInfo() {
		System.out.println("O nome do jogo é"+ nome);
		System.out.println("O preço dele é"+ preco);
		System.out.println("Sua distribuidora é"+ distribuidora);
	}
       
       
       
}