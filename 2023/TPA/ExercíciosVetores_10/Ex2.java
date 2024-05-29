package com.core;

import java.util.Scanner;

public class Ex002 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[5];

    for (int i = 0; i <= (vetorA.length - 1); i++) {
      System.out.print("digite o " + (i + 1) + "° numero: ");
      vetorA[i] = scan.nextInt();
    }

    for (int atual : vetorA) {
      for (int i = 0; i <= 10; i++) {
        System.out.printf("%d x %d = %d%n", atual, i, (atual * i));
      }
      System.out.println("--------------------");
    }

    scan.close();
  }
}
/*2. Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.

*/
