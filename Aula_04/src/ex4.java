import java.util.Scanner;

public class ex4 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int idade , genero, dev  , back = 0 , front = 0 , mobaile= 0, full= 0, total =0, somaidade;
		float media= 0.0f;
		String continua= "s";
		
		 while(continua.equalsIgnoreCase("s")) {
			 System.out.println("Qual a sua idade?");
			 idade= leia.nextInt();
			 
			 do {
			 System.out.println("Digite seu esporte favorito : 1 - Fut / 2 - Vol / 3- Basq / 4- Outros");
			 esporte = leia.nextInt();
			 
			 while(esporte <1 || esporte > 5);
			 }

		 }
	}
}
