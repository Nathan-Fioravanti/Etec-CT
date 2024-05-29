import java.util.Scanner;
public class Main {
			public static void main(String[] args) {
				Scanner ler=new Scanner(System.in);
						
				ClientePremium  Matheus = new ClientePremium();
				Cliente  Lucas = new Cliente();
				
				System.out.println("Qual o seu nome?");
				Lucas.setNome(ler.next());
				
				System.out.println("Qual a sua idade?");
				Lucas.setIdade(ler.nextInt());
				
				System.out.println("QUal o valor pedido do produto");
				Lucas.setValor_Pedido(ler.nextDouble());
				
				System.out.println(Lucas.getNome() + " Seu valor com desconto é ");
				System.out.println(Lucas.calcularDesconto()+ " R$");
				
				
				System.out.println("Qual o seu nome?");
				Matheus.setNome(ler.next());
				
				System.out.println("Qual a sua idade?");
				Matheus.setIdade(ler.nextInt());
				
				System.out.println("QUal o valor pedido do produto");
				Matheus.setValor_Pedido(ler.nextDouble());
				
				System.out.println(Matheus.getNome() + " Seu valor com desconto é ");
				System.out.println(Matheus.calcularDesconto()+ " R$");
				
						
			}
}

