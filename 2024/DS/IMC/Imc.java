
public class Imc {
		String nome;
		int idade;
		double peso;
		double altura;
		
		String indice(String valor) {
			
				double  indice = peso/(altura*altura);
				if (indice < 18.4) {
					return nome+" voc� est� abaixo do peso";
				}else if(indice <= 24.9) {
					return nome+" voc� est� no peso normal";
				}else if(indice <=29.9) {
					return nome+" voc� est� em sobrepeso";
				}else if(indice <= 34.9 ) {
					return nome+" voc� est� em obesidade grau 1";
				}else if( indice <= 39.9) {
					return nome+" voc� est� em obesidade grau 2";
				}else if(indice >=40) {
					return nome+" voc� est� em obesidade grau 3";
				}
				return "Erro: valor invalido";
				
				
		}
}
