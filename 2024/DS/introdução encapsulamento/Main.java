import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Imc cliente = new Imc();
		
		System.out.println("Qual o seu nome?");
		cliente.setNome(ler.next());
		
		System.out.println("Qual a sua idade?");
		cliente.setIdade(ler.nextInt()); 
		
		System.out.println("Qual o seu peso?");
		cliente.setPeso(ler.nextDouble());
		
		System.out.println("Qual a sua altura?");
		cliente.setAltura(ler.nextDouble());
		
		
		
		
		
		
		cliente.indice("imc");
		System.out.println(cliente.indice("imc"));
		
	}
}
