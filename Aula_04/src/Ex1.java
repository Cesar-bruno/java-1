import java.util.Scanner;

public class Ex1 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1,num2;
		System.out.println("digite o primeiro número : ");
		num1 = leia.nextInt();
		System.out.println("digite o segundo número : ");
		num2= leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro número deve ser menor que o segundo. ");
		}
		else {
			for (int i = num1 ; i <=num2 ; i++) {
			 if (i%3 == 0 && i%5 ==0) {
				 System.out.println(i);
				 
			 }
			}
			
		}
		

	}

}
