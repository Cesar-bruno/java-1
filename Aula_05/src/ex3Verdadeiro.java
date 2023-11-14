import java.util.Scanner;

public class ex3Verdadeiro {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int [][] matriz =  new int [3][3];
		int somap = 0 , somas = 0;
		String diagonalP= "" , diagonalS= "";
		
		for (int i =0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("digite o número da posição : ( " + (i) + " , " + (j) +  ") :");	
				matriz[i][j] = leia.nextInt();
			}
		}
		//diagonal principal
		for ( int i = 0 ; i < matriz.length; i++) {
			diagonalP += matriz[i][i] + "";
			somap+= matriz[i][i];
		}
		
		//diagonal secundaria 
				for ( int i = 0 ; i < matriz.length; i++) {
					diagonalS += matriz[i][matriz.length -1 - i] + "";
					somas+= matriz[i][matriz.length -1 - i];
				}
			System.out.println("elementos da diagonal Principal : " + diagonalP);
			System.out.println("Soma dos elementos da diagonal Principal : " + somap);
			
			System.out.println("elementos da diagonal Principal : " + diagonalS);
			System.out.println("Soma dos elementos da diagonal Principal : " + somas);
			
			
			
			
	}

}
