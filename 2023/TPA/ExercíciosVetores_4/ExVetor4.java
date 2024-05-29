import java.util.Scanner;
public class Ex4 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int a[],  i;
			double media, c=0;
			final int TAM=10;
			a = new int [TAM];
			
			for (i=0; i<TAM; i++) {
				
				System.out.println("Entre com o " +(i+1)+ "° valor do vetor de A");
				a[i] = ler.nextInt();
				if (i==0) {
					c = a[i];
					c = c + a[i];
				}
				else {
					c = c + a[i];
				}
			}
			media = c/TAM;
			System.out.println("Sua média é "+ media);
			ler.close();
	}
		
}
