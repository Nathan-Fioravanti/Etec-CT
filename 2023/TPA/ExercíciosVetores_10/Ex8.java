package com.core;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA =new int[10];
		int valorVerificar = 5;
		
		for(int i=0; i<=(vetorA.length - 1); i++) {
			System.out.printf("digite o %dº numero", i+1);
			vetorA[i] = scan.nextInt();
		}
		
		boolean estaNoVetor = false;
		
		for(int atual : vetorA) {
			if(atual == valorVerificar) {
				estaNoVetor = true;
			}
		}
		
		System.out.print("o valor está no vetor? ");
		System.out.println(estaNoVetor ? "Sim" : "Não");
		
		scan.close();
	}

}
