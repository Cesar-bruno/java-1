import java.util.Scanner;

public class Ex1 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] num1 = { 2,5,1,3,4,9,7,8,10,6 };
		int num2 ,validar = -1 ;
		
		System.out.println("Pesquise um número: ");
		num2 = leia.nextInt();
		
		for (int indice = 0; indice < num1.length; indice++) {
			
				if(num1[indice] == num2) {
					validar=indice;
				}
		}
		
			
				if( validar != -1)	{
			System.out.println("O numero " + num2 + " foi encontrado na posição " + validar);
				
		
				}else {
				System.out.println("O numero " + num2 + " não foi encontrado!");
	}
		}
	
}
