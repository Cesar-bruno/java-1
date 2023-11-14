
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex3Set {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		HashSet<Integer> numeros = new HashSet <Integer>();
		int num;
		

		for (int i = 0; i < 10 ; i++){	
		System.out.println("digite um número : ");
		num =leia.nextInt();
		numeros.add(num);
		}
		
		System.out.println("\n");
		
		Iterator < Integer > iNumeros =   numeros.iterator();
		while(iNumeros.hasNext())
			System.out.println(iNumeros.next());
		

	}

}
