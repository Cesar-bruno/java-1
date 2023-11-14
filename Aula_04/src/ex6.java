import java.util.Scanner;

public class ex6 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num =0 , contador=0;
		float soma = 0.0f , media = 0.0f;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
				if(num %3 ==0 && num !=0) {
					soma += num;
					contador++;
					
				}
			
		}while(num !=0);
			media =  soma / contador;
			System.out.println("A media de todos os números multiplos de 3 é de : " + media);
	}

}
