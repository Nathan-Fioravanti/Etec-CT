package revisao;
import java.util.Scanner;
public class Ex001 {
		public static void main(String[] args) {
				Scanner ler = new Scanner (System.in);
				int numero;
				System.out.println("coloque o seu numero");
				numero=ler.nextInt();
				if (numero < 0) {
					System.out.println("O número " +numero+ " é negativo");
				}
				else {
					System.out.println("O número " +numero+ " é positivo");
				}
		}
}
