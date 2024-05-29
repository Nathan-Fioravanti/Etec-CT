package revisao;
import java.util.Scanner;
public class Ex002 {
			public static void main(String[] args) {
					Scanner ler = new Scanner (System.in);
					int numero;
					System.out.println("coloque o seu numero");
					numero=ler.nextInt();
					if (numero%2 == 0) {
						System.out.println("O número "+numero+ " é par");
					}
					else {
						System.out.println("O número "+numero+ " é impar");
					}
}
}