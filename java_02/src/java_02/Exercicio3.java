package java_02;

import java.util.Scanner;

public class Exercicio3 {
	static Scanner leia =  new Scanner(System.in);
	
	public static void main(String[] args) {
		float salarioBruto , adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("digite o Salario Bruto :");
		salarioBruto = leia.nextFloat();
		
		System.out.println("digite o valor do adicional noturno :");
		adicionalNoturno= leia.nextFloat();
		
		System.out.println("digite o valor das Horas extras :");
		horasExtras = leia.nextFloat();
		
		System.out.println("digite o valor dos descontos :");
		descontos = leia.nextFloat();
		
		
		salarioLiquido = salarioBruto +  adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Seu salário liquido é de : R$" + salarioLiquido);
	

	}

}
