import java.util.ArrayList;
import java.util.Scanner;

public class ex1ArranyList {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList <String> cores = new ArrayList < String > ();
		String cor;
		
			for (int i = 0; i < 5 ; i++){	
			System.out.println("digite uma cor : ");
			cor =leia.nextLine();
			cores.add(cor);
			}
			
			System.out.println("\n");
			//mostra as cores adicionadas
			
			System.out.println("as cores adicionais foram : ");
			cores.forEach(System.out::println);
			System.out.println("\n");
			
			//mostra as cores em forma ordenada			
			System.out.println("A lista de forma ordenada fica da seguinte maneira : ");
			cores.sort(null);
			cores.forEach(System.out::println);
	}

}
