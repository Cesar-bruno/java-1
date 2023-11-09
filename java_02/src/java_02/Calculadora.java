package java_02;

import java.util.Scanner;

public class Calculadora {
	static Scanner leia =  new Scanner(System.in);
			
	public static void main(String[] args) {
		double numero1, numero2;
		System.out.println(" digite o primeiro número ");
		numero1=leia.nextDouble();
		
		System.out.println(" digite o segundo número ");
		numero2=leia.nextDouble();
		
		System.out.println("soma é igual a = " + (numero1 + numero2));
		System.out.println("multiplicação é igual a = " + (numero1 * numero2));
		System.out.println("subtração é igual a = " + (numero1 - numero2));
		if (numero2 > 0) {
			System.out.println("divisao é igual a = " + (numero1 / numero2));
			
		}else {
			
			System.out.println("não existe divisão por 0");
		}
		
		System.out.println("raiz quadra do número 1 é = " + (Math.sqrt(numero1)));
		System.out.println("potencia do número 2 é = " + (Math.pow(numero1, numero2)));
		
	}

}
