package revisao;
import java.util.Scanner;
public class Ex004 {
			public static void main(String[] args) {
				Scanner ler = new Scanner (System.in);
				int anoatual, anonasc, idade ;
				String escolha;
				System.out.println("Deseja calcular a idade de mais uma pessoa?");
				escolha=ler.next();
				while (escolha.equalsIgnoreCase("SIM")) {
					System.out.println("Qual o ano de nascimento?");
					anonasc = ler.nextInt();
					System.out.println("Qual o ano atual?");
					anoatual = ler.nextInt();
					idade = anoatual - anonasc;
					System.out.println("A idade da pessoa é" +idade);
						if(idade < 18) {
							System.out.println("Essa pessoa é menor de idade");
						}
						else {
							System.out.println("Essa pessoa é maior de idade");
							}
						System.out.println("Deseja calcular a idade de mais uma pessoa?");
						escolha=ler.next();
				}
				System.out.println("fim do programa");
			}
}
