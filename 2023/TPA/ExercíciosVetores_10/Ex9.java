package com.core;

import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<=(vetorA.length -1); i++) {
			System.out.printf("Digite o %d valor: ", i);
			vetorA[i] = scan.nextInt();
		}
		
		boolean ePalindromo = true;
		
		int j=(vetorA.length-1);
		
		for(int i=0; i<=(vetorA.length -1); i++) {
			if(vetorA[i] != vetorA[j]) {
				ePalindromo = false;
			}
			j--;
		}
		
		System.out.println(ePalindromo);
		
		scan.close();
	}

}
