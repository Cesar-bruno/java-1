import java.util.Scanner;

public class Exericio4if {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String palavra1 , palavra2, palavra3 ;
		
		System.out.println("digite a primeira palavra: ");
		palavra1= leia.nextLine();
		
		System.out.println("digite a primeira palavra: ");
		palavra2= leia.nextLine();
		System.out.println("digite a primeira palavra: ");
		palavra3= leia.nextLine();
		
		if(palavra1.equalsIgnoreCase("Vertebrado")) {
			if(palavra2 .equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				}
			}
			else {
				System.out.println("pomba");
				}
			
		}else {
			if (palavra3.equalsIgnoreCase("herbivoro")) {
				System.out.println("vaca");
			}
			else {
				System.out.println("Homem");
			}
		}
		
		if(palavra1.equalsIgnoreCase("invertebrado")) {
			if(palavra1.equalsIgnoreCase("inseto")) {
			if(palavra2 .equalsIgnoreCase("hematofogo")) {
				System.out.println("pulga");
			}
			else {
				System.out.println("lagarta");
			}
			}
		else {
			if (palavra3.equalsIgnoreCase("onivoro")) {
				System.out.println("minhoca");
			}
			else {
				System.out.println("sanguessuga");
			}
		}
		}
	}
}


