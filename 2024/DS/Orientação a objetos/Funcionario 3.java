
public class Funcionario {

		String nome;
		double salarioBruto;
		double imposto;
		
		double salarioLiquido (double valor) {
			imposto = salarioBruto/100*10;
			double salarioLiquidos = salarioBruto - imposto;
			return salarioLiquidos;
			
		}
		double aumentaSalario (double valor) {

			double aumentaSalario = salarioBruto + valor;
			return aumentaSalario;
		}
}
