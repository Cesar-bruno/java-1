package java_02;

import java.util.Scanner;

public class Exercicio4 {
	static Scanner leia =  new Scanner(System.in);
	public static void main(String[] args) {
		
		
		float num1, num2, num3, num4 , calculo;

		System.out.println("digite o primeiro número :");
		num1 = leia.nextFloat();
		
		System.out.println("digite o segundo número :");
		num2 = leia.nextFloat();
		
		System.out.println("digite o terceiro número :");
		num3 = leia.nextFloat();
		
		System.out.println("digite o quarto número :");
		num4 = leia.nextFloat();
		
		calculo = (num1 * num2) - (num3 * num4);
		
		System.out.println(" a diferença do produto  dos numeros 1 e 2 pelo produto dos numeros 3 e 4 é de : " + calculo);
	}

}
