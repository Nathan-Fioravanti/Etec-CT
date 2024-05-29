package com.core;

import java.util.Scanner;

public class Ex005 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[5];
    int[] vetorB = new int[5];
    
    for(int i=0; i<=(vetorA.length - 1); i++){
      vetorA[i] = scan.nextInt();
    }
    
    for(int i=0; i<=(vetorA.length - 1); i++){
      int result = 1;
        
      System.out.printf("%d! = ", vetorA[i]);
              
      for(int c=vetorA[i]; c>0; c--){
        result *= c;
        System.out.printf("%d", c);
        
        System.out.print(c != 1 ? " x " : "");
      }
      
      vetorB[i] = result;
      System.out.printf(" = %d%n", result);
    }
  }
}
/*
5. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do
elemento correspondente em A.
*/
