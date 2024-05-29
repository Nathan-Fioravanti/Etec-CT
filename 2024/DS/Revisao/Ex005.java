package revisao;
import java.util.Scanner;
public class Ex005 {
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				double[][] notas = new double[3][4];
				for(int i=0; i<notas.length; i++) {
					System.out.printf("Entre com as notas do aluno %d%n", i+1);
					for(int j=0; j<notas[i].length; j++) {
						System.out.printf("Entre com a nota %d: %n", j+1);
						double notaAtual = scan.nextDouble();
						
						notas[i][j] = notaAtual;
					}
					System.out.println("-----------------------------------");
				}
				
				
				for(double[] aluno : notas) {
					for(double nota : aluno) {
						System.out.print("[" + nota + "]");
					}
					System.out.println();
				}
				
				scan.close();
			}
			}
			

