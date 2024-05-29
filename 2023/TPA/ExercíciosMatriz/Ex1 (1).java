
public class Ex001 {

  public static void main(String[] args) {

   
   int[][] matrizA = new int[4][4];
   
   matrizA[0][0] = 1;
   
   int anterior = matrizA[0][0];
   for(int i=0; i<=matrizA.length-1; i++){
     for(int j=0; j<= matrizA[i].length-1; j++){
       matrizA[i][j]= anterior * 2;
       anterior = matrizA[i][j];
     }
   }
   
   for(int i=0; i<=matrizA.length-1; i++){
   System.out.print("[");
     for(int j=0; j<= matrizA[i].length-1; j++){
       System.out.print(matrizA[i][j] == matrizA[i][matrizA[i].length -1] ? matrizA[i][j] : matrizA[i][j] + ", ");
     }
     System.out.println("]");
   }
  }
}
/*
a) Criar uma matriz 4x4 de inteiros sendo que cada elemento da matriz será preenchido 
com o dobro do elemento anterior (o elemento[0][0] será o 2)
*/