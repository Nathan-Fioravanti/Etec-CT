
import java.util.Scanner;
public class MainP {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			Produto novoProduto = new Produto();
			
			System.out.println("Qual � o seu nome?");
			novoProduto.setNomeP(ler.next());
			
			System.out.println("Qual foi o pre�o de custo do produto?");
			novoProduto.setPrecoCusto(ler.nextDouble());
			
			System.out.println("Qual foi o pre�o de venda do produto?");
			novoProduto.setPrecoVenda(ler.nextDouble());
			
			System.out.println("Sua margem de lucro foi de "+novoProduto.calcularMargemLucro() +"R$");
			System.out.println("A porcentagem de lucro foi de "+novoProduto.getMargemLucroPorcentagem(0)+ "%");
			
	}
}
