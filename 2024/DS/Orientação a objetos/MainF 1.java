import java.util.Scanner;

public class MainF {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual o seu sálario bruto?");
		double valor;
		

		
		// TODO Auto-generated method stub
		Funcionario pedro = new Funcionario();
		pedro.salarioBruto =ler.nextDouble();
		
		//Pedro
		pedro.salarioLiquido(0);
		System.out.println("O salario liquido de Pedro é de " + pedro.salarioLiquido(0)+ " R$");
		
		System.out.print("Quanto vai aumentar seu salário?");
		valor = ler.nextDouble();
		pedro.aumentaSalario(0);
		System.out.println("O salário atual de Pedro é de " + pedro.aumentaSalario(valor)+ " R$");
		
		//Vagner
		Funcionario vagner = new Funcionario();
		System.out.print("Qual o seu sálario bruto?");
		vagner.salarioBruto = ler.nextDouble();
		vagner.salarioLiquido(0);
		System.out.println("O salario liquido de Vagner é de " + vagner.salarioLiquido(0)+ " R$");
		
		System.out.print("Quanto vai aumentar seu salário?");
		valor = ler.nextDouble();
		vagner.aumentaSalario(0);
		System.out.println("O salário atual de Vagner é de  " + vagner.aumentaSalario(valor)+ " R$");
		
	}

}
