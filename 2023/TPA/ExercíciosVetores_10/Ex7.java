package com.core;

import java.util.Scanner;

public class Ex007 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // LEITURA DOS 2 VETORES

    int[] vetorA = new int[5];
    int[] vetorB = new int[5];

    for (int i = 0; i <= (vetorA.length - 1); i++) {
      System.out.printf("Digite o %dº numero do vetor A: ", i + 1);
      vetorA[i] = scan.nextInt();

      System.out.printf("Digite o %dº numero do vetor B: ", i + 1);
      vetorB[i] = scan.nextInt();
    }

    // CONTAGEM DE QUANTOS VALORES POSSUEM INTERSECÇÃO
    int contadorDiferenca = 0;

    for (int i = 0; i <= (vetorA.length - 1); i++) {
      for (int c = 0; c <= (vetorB.length - 1); c++) {
        if (vetorA[i] != vetorB[c]) {
          contadorDiferenca++;
        }
      }
    }

    // ARMAZENAMENTO DOS VALORES QUE POSSUEM INTERSECÇÃO
    int[] vetorC = new int[contadorDiferenca];
    int contadorC = 0;

    for (int i = 0; i <= (vetorA.length - 1); i++) {
      for (int c = 0; c <= (vetorB.length - 1); c++) {
        if (vetorA[i] != vetorB[c]) {
          vetorC[contadorC] = vetorA[i];
          contadorC++;
        }
      }
    }
    System.out.println("-----------------");
    System.out.println("Os valores que são diferentes em ambos os vetores são: ");
    // APRESENTAÇÃO DOS VALORES
    for (int diferencaAtual : vetorC) {
      System.out.printf("%d, ", diferencaAtual);
    }
  }
}

/*
7. Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver 
um programa que crie um vetor C que é a diferença dos conjuntos formados pelos elementos dos vetores A e B. Diferença de conjuntos = todos os 
elementos do conjunto A que não existem no conjunto B.
*/