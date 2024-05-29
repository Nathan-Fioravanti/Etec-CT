import java.util.Random;
import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int matriz[][] = new int [4][4];
	
		Random random = new Random ();
		
		//COLOCAR VALORES NA MATRIZ (nota: os numeros não são repetidos)
		int contadorLinha=0;
		int contadorColuna=0;
		while (true) {
			int value = random.nextInt() %50;
			if(value > 0 && value <= 75) {
				
				
				boolean existeNoVetor = false;
				for(int[] atual : matriz) {
					for(int atual2 : atual) {
						if(atual2 == value) {
							existeNoVetor = true;
						}
					}
				}
				if(!existeNoVetor) {
					matriz[contadorLinha][contadorColuna] = value;
					contadorColuna++;
				}
				
				
			}
			if (contadorColuna == 4) {
				contadorColuna = 0;
				contadorLinha++;
			}
			if (contadorLinha == 4) {
				break;
			}
		}
		//Backup da tabela original
		int matrizOriginal[][] = new int [4][4];
		
		for(int i=0; i<=matriz.length-1; i++){
	        for(int j=0; j<= matriz[i].length-1; j++){
	        	matrizOriginal[i][j] = matriz[i][j]; 
	        }
	      }
		
		//----------------------------------------
		int contadorRodadas = 0;
		int contadorPontos = 0;
		
		contadorLinha=0;
		contadorColuna=0;
		
		while(true) {
			System.out.println("Informe o Númera da Sorte hahahaha");
			int numeroCantado = scan.nextInt();
			
			
			
			boolean existeNoVetor = false;
			for(int[] atual : matriz) {
				for(int atual2 : atual) {
					if(atual2 == numeroCantado) {
						existeNoVetor = true;
					}
				}
			}
			
			int linhaAcertada = 0;
			int colunaAcertada = 0;
			
			for(int i=0; i<=matriz.length-1; i++){
		        for(int j=0; j<= matriz[i].length-1; j++){
		        	if(matriz[i][j] == numeroCantado) {
						existeNoVetor = true;
						linhaAcertada = i;
						colunaAcertada = j;
					}
		        }
		      }
			
			if(existeNoVetor) {
				matriz[linhaAcertada][colunaAcertada] = -1;
				contadorPontos++;
				int contadorAle = 16 - contadorPontos;
				System.out.println("Parabens, este numero está na cartela, faltam " + contadorAle + " numeros");
			} else {
				System.out.println("Você errou hahahhahaha, tente novamente");
			}

			
			contadorRodadas++;
			
			if(contadorPontos == 16) {
				System.out.println("Parabens! você venceu hahaha, levou " + contadorRodadas + " rodadas");
				break;
			}
		}
		
		
		
		//Apresentar
		for(int i=0; i<=matrizOriginal.length-1; i++){
	    	   System.out.print("[");
	    	   for(int j=0; j<= matrizOriginal[i].length-1; j++){
	    	       System.out.print(matrizOriginal[i][j] == matrizOriginal[i][matrizOriginal[i].length -1] ? matrizOriginal[i][j] : matrizOriginal[i][j] + ", ");
	    	   }
	    	   System.out.println("]");
	    }
		
		scan.close();

	}

}
