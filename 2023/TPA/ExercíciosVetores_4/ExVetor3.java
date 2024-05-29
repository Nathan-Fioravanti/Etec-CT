import java.util.Scanner;
public class Ex3 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			int a[], b[], i, j=0;
			final int TAM=10;
			a = new int [TAM];
			b = new int [TAM];
			
			for (i=0; i<TAM; i++) {
				System.out.println("Entre com o " +(i+1)+ "° valor do vetor de A");
				a[i] = ler.nextInt();
				
		}
			
			
			int contadorB = 0;
			
			for(i=9; i>=0; i--) {
				b[contadorB] = a[i];
				contadorB++;
			}
			
			System.out.print("B[");
			for (i=0; i<TAM; i++) {
				System.out.print( " " + b[i]);
			}
			System.out.print(" ]");
	}
}
