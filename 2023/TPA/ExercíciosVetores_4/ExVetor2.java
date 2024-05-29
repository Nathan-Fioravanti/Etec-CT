import java.util.Scanner;
public class Ex2 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			int a[], b[], c[], i;
			final int TAM=10;
			a = new int [TAM];
			b = new int [TAM];
			c = new int [TAM];
			
			for (i=0; i<TAM; i++) {
				System.out.println("Entre com o " +(i+1)+ "° valor do vetor de A");
				a[i] = ler.nextInt();
		}
			for (i=0; i<TAM; i++) {
				System.out.println("Entre com o " +(i+1)+ "° valor do vetor de B");
				b[i] = ler.nextInt();
				
				c[i] = a[i] + b[i];
		}
			
			System.out.print("C[");
			for (i=0; i<TAM; i++) {
				System.out.print( " " + c[i]);
			}
			System.out.print(" ]");
	}
}