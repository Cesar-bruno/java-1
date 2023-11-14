import java.util.Scanner;

public class Matrizes {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		 int matriz [] [] =  {{1,2,3} , {4,5,6} , {7,8,9}};
		 double [][] matrizdouble = new double[3][3];
		 //matriz irregular {2,3}
		 int[][] matrizIrregular = {{1,2,3} , {4,5,6}};
		 
		/* //controla a linha
		 for (int i = 0; i <matriz.length; i++) {
			 //controla a coluna
			 for (int j = 0; j <matriz.length; j++) {
				 System.out.println("Matriz [" + i + "][" + j + "]" + matriz[i] [j]);
			 }
			 
		 }
		 
		 System.out.println("\n");
		 
		 // colocando matriz com base nos dados que o user colocar
		 for (int i = 0; i < matrizdouble.length; i++) {
			 
			 for (int j = 0; j <matrizdouble.length; j++) {
				 System.out.println("Matriz [" + i + "][" + j + "]");
				 matrizdouble[i][j] = leia.nextDouble();
			 	}
			 }
		 	for (int i = 0; i <matrizdouble.length; i++) {
		 		for (int j = 0; j <matrizdouble.length; j++) {
				 System.out.println("Matriz [" + i + "][" + j + "] " +  matrizdouble[i][j]);
		 		}
		 	}*/
		 // trabalhando com matriz irregular
			for (int i = 0; i <matrizIrregular.length; i++) {
		 		for (int j = 0; j <matrizIrregular[i].length; j++) {
				 System.out.println("Matriz [" + i + "][" + j + "] " +  matrizIrregular[i][j]);
		 		}
			}	
			System.out.println("\n");
			
			for(int[] matriz1: matrizIrregular) {
				for(int matriz2 : matriz1) {
					//checando se os elementos são pares
					if(matriz2%2 == 0);
					System.out.println(matriz2);
				}
			}
					
		 }	

}
