package java_02;

import java.util.Scanner;

public class Operadores {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero1 = 10, numero2= 20;
		String nome = "Bruno";
		int tamanho;
		
			System.out.println(" A soma do número 1 + o número 2 é igual a = " +  (numero1 + numero2));
			
			float media = 2.456789f;
			
			System.out.printf(" A média final do %s é %.2f" , nome, media);
			
			System.out.println("\n\ndigite o tamanho ");
			tamanho = leia.nextInt();
			System.out.println("o tamanho é = " + tamanho);
	}

}
