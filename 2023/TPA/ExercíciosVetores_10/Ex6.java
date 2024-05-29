package com.core;

import java.util.Scanner;

public class Ex006 {

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
    int contadorInterseccao = 0;
    // int contadorVetorC = 0;
    for (int i = 0; i <= (vetorA.length - 1); i++) {
      for (int c = 0; c <= (vetorB.length - 1); c++) {

        // if (vetorA[i] == vetorB[c] && contadorVetorC == 0) {
        // contadorVetorC++;

        if (vetorA[i] == vetorB[c]) {
          contadorInterseccao++;
        }
      }
    }

    // ARMAZENAMENTO DOS VALORES QUE POSSUEM INTERSECÇÃO
    int[] vetorC = new int[contadorInterseccao];
    int contadorC = 0;

    for (int i = 0; i <= (vetorA.length - 1); i++) {
      for (int c = 0; c <= (vetorB.length - 1); c++) {
        // verifica se já existe o valor atual em C
        if (vetorA[i] == vetorB[c]) {
          int contadorVetorC = 0;
          for (int atual : vetorC) {
            if (atual == vetorA[i]) {
              contadorVetorC++;
            }
          }

          if (contadorVetorC == 0) {
            vetorC[contadorC] = vetorA[i];
            contadorC++;
          }
        }
      }
    }
    System.out.println("-----------------");

    if (vetorC.length == 0) {
      System.out.println("Nenhum elemento teve intersecção. ");
    } else {
      System.out.println("Os valores que possuem intersecção são: ");
      // APRESENTAÇÃO DOS VALORES
      String builder;
      for (int interseccaoAtual : vetorC) {
        //if(builder.contains(String(interseccaoAtual) == false){
//          builder += ""+ interseccaoAtual + ", ";
  //      }
        
        System.out.printf("%d, ", interseccaoAtual);
      }
    }
  }
}

/*6. Criar dois vetores A e B cada um com 10 Elementos inteiros. Desenvolver
 *um programa que realize a intersecção dos vetores A e B para produzir um
 *vetor C. Interseção de conjuntos = todos os elementos *que existem em A e
 *também existem em B.
 */
