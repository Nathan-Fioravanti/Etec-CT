
public class jogoEletronico extends jogo {
      private String plataforma;
      private String genero;
      
      
      public jogoEletronico() {
    	  
      }
      
      public jogoEletronico (String nome, double preco, String distribuidora, String plataforma,  String genero) {
    	  super(nome, preco, distribuidora);
    	  this.genero = genero;
    	  this.plataforma = plataforma;
      }
      
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
      
      
      public int jogarOnline(int quantJogadores) {
    	  return quantJogadores;
      }
      
}

