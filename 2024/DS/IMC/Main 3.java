import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Imc cliente = new Imc();
		
		System.out.println("Qual o seu nome?");
		String nome = ler.next();
		
		System.out.println("Qual a sua idade?");
		int idade = ler.nextInt();
		
		System.out.println("Qual o seu peso?");
		double peso = ler.nextDouble();
		
		System.out.println("Qual a sua altura?");
		double altura = ler.nextDouble();
		
		cliente.nome = nome;
		cliente.idade = idade;
		cliente.peso = peso;
		cliente.altura = altura;
		
		cliente.indice("imc");
		System.out.println(cliente.indice("imc"));
		
	}
}
