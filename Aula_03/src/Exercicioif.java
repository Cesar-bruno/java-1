import java.util.Scanner;

public class Exercicioif {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int num1,num2,num3,soma;
		
		System.out.print("digite o primeiro número:");
		num1 = leia.nextInt();
		System.out.print("\ndigite o segundo número:");
		num2 = leia.nextInt();
		System.out.print("\ndigite o terceiro número:");
		num3 = leia.nextInt();
		
		soma= num1 + num2;
		
		if(soma > num3) {
			System.out.printf("A soma dos números %s e %s é igual a %s , e este número  é  maior que  %s." , num1 , num2 ,soma,  num3);
		}
		else if (soma < num3) {
			System.out.printf("A soma dos números %s e %s é igual a %s , e este número  é  menor que  %s" ,num1 , num2 ,soma,  num3);
			
		}
		else if (soma == num3) {
			
			System.out.printf("A soma dos números %s e %s é igual a %s , e este número  é  igual a  %s" , num1 , num2 ,soma,  num3);
		}		
		
	}

}
