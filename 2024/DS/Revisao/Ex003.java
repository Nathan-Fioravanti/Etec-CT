package revisao;
import java.util.Scanner;
public class Ex003 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			int senha;
			System.out.println("Insira a senha");
			senha = ler.nextInt();
				while (senha != 2002) {
					System.out.println("Senha inválida");
					System.out.println("Insira a senha");
					senha = ler.nextInt();
				}
			
				System.out.println("Senha válida");
		}
}
