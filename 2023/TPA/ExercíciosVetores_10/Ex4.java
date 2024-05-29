package com.core;

public class Ex004 {

  public static void main(String[] args) {

    int[] vetorA = new int[11];

    int resultPotencia = 0;

    for (int i = 0; i <= (vetorA.length - 1); i++) {

      for (int c = 1; c <= i; c++) {
        resultPotencia = resultPotencia * 2;
      }

      vetorA[i] = resultPotencia;

      resultPotencia = 1;
    }

    for (int atual : vetorA) {
      System.out.println(atual);
    }
  }
}

/*4. Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada
*elemento do vetor A é formado pela potência de base 2 elevado ao expoente
*igual a posição do respectivo elemento, ou seja:
*A[i] = 2i
.
*/
