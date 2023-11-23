package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		do {
			try {

				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();

				divide(dividendo, divisor);

				loop = false;

			} catch (InputMismatchException e) {
				ler.nextLine();
				System.err.println("Exception : " + e);
				System.out.println("Digite valores inteiros.");
			} catch (ArithmeticException e) {
				ler.nextLine();
				System.err.println("Exception : " + e);
				System.out.println("Digite numeros positivos");
			}
			finally {
				System.out.println(" o finally foi executado");
			}

		} while (loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
