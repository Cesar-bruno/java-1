import java.util.Scanner;

public class Ex1DoWhile {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int num1 = 0, soma = 0;		
		do{
			
			System.out.println("Digite um número: ");
			num1 = leia.nextInt();
			 if(num1 > 0) {
				 soma=num1+ soma;
			 }
		}
			
	
		while(num1 != 0 );
	
		System.out.println(soma);
	}
	

}
