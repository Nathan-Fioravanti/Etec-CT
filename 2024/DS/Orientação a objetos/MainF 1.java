import java.util.Scanner;

public class MainF {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual o seu s�lario bruto?");
		double valor;
		

		
		// TODO Auto-generated method stub
		Funcionario pedro = new Funcionario();
		pedro.salarioBruto =ler.nextDouble();
		
		//Pedro
		pedro.salarioLiquido(0);
		System.out.println("O salario liquido de Pedro � de " + pedro.salarioLiquido(0)+ " R$");
		
		System.out.print("Quanto vai aumentar seu sal�rio?");
		valor = ler.nextDouble();
		pedro.aumentaSalario(0);
		System.out.println("O sal�rio atual de Pedro � de " + pedro.aumentaSalario(valor)+ " R$");
		
		//Vagner
		Funcionario vagner = new Funcionario();
		System.out.print("Qual o seu s�lario bruto?");
		vagner.salarioBruto = ler.nextDouble();
		vagner.salarioLiquido(0);
		System.out.println("O salario liquido de Vagner � de " + vagner.salarioLiquido(0)+ " R$");
		
		System.out.print("Quanto vai aumentar seu sal�rio?");
		valor = ler.nextDouble();
		vagner.aumentaSalario(0);
		System.out.println("O sal�rio atual de Vagner � de  " + vagner.aumentaSalario(valor)+ " R$");
		
	}

}
