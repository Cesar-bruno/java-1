package java_02;

import java.util.Scanner;

public class Exercicio1 {
	static Scanner leia =  new Scanner(System.in);
	public static void main(String[] args) {
		
		float salario,abono, novosalario;
		
			System.out.println("digite o salário");
			salario = leia.nextFloat();
			System.out.println("digite o abono");
			abono = leia.nextFloat();
			
			novosalario= salario + abono;
			
			System.out.println("Seu novo sálario é de : R$" + novosalario);
		
			
			
	}

}
