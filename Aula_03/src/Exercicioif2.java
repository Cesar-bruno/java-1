import java.util.Scanner;

public class Exercicioif2 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int num1;
		
		System.out.println("digite um número");
		num1 = leia.nextInt();
		
		
		
		if (num1 %2 ==0 && num1 < 0) {
			System.out.println("este número é par e negativo");
			}
		else if ( num1 < 0 && num1 %2 !=0) {
			System.out.println(" este número é impar e negativo");
		}
		else if(num1 %2 ==0 && num1 > 0) {
			System.out.println("este número é par e positivo");
			}
		else if(num1 %2 ==1 && num1 > 0) {
			System.out.println("este número é impar e positivo");
			}

	}

}
