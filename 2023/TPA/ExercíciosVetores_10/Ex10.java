package com.core;

import java.util.Scanner;

public class Ex010 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[10];
    int[] vetorB = new int[10];

    for (int i = 0; i <= 9; i++) {
      System.out.print("Digite o " + (i + 1) + " valor: ");
      vetorA[i] = scan.nextInt();
      vetorB[i] = vetorA[i];
    }

    int contadorSuperLista = 0;
    for (int j = 0; j <= 9; j++) {
      int menor = vetorB[j];
      int indiceMenor = j;
      for (int i = j; i <= 9; i++) {
        if (vetorB[indiceMenor] > vetorB[i]) {
          menor = vetorB[i];
          indiceMenor = i;
        }
      }

      int temp = vetorB[j];
      vetorB[j] = menor;
      vetorB[indiceMenor] = temp;
    }

    // output
    System.out.print("os valores do vetorA são: \n [");
    for (int atual : vetorA) {
      System.out.print(atual);
      System.out.print(" ");
    }
    System.out.println("]");

    System.out.print("os valores do vetorB ordenado de forma crescente são: \n [");

    for (int atual : vetorB) {
      System.out.print(atual);
      System.out.print(" ");
    }
    System.out.println("]");

    scan.close();
  }
}
