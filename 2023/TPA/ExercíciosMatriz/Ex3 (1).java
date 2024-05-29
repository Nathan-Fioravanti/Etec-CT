import java.util.Random;

public class Ex003 {

	public static void main(String[] args) {
	    int[][] matriz = new int[3][4];
	    
	    Random random = new Random();
	    
	    for(int i=0; i<=matriz.length-1; i++){
	        for(int j=0; j<= matriz[i].length-1; j++){
	        	if(j!=3) {
		        	matriz[i][j] = random.nextInt() % 50;
	        	} else {
		        	matriz[i][j] = 0;
	        	}

	        }
	      }
	    
	    int ultimo = 0;
	    
	    for(int i=0; i<=matriz.length-1; i++){
	        for(int j=0; j<= matriz[i].length-1; j++){
	        	if(j!=3) {
	        		ultimo = matriz[i][j];
	        		matriz[i][3] += ultimo;

	        	}

	        }
	      }
	    
	    for(int i=0; i<=matriz.length-1; i++){
	    	   System.out.print("[");
	    	     for(int j=0; j<= matriz[i].length-1; j++){
	    	       System.out.print(matriz[i][j] == matriz[i][matriz[i].length -1] ? matriz[i][j] : matriz[i][j] + ", ");
	    	     }
	    	     System.out.println("]");
	    	   }
	    
	    System.out.println("");
	}

}
//c) Criar uma matriz 3x4 sendo que na última coluna deverá ter a soma de cada linha