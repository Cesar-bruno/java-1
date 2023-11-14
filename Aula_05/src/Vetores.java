import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] pessoas = {"luiza" , "aline" , "vinicius" , "antonio", "vitor" , "samara"};
		
		float[] notas = new float[5];
		
		// mostrar o array declarando valor		
		for (int indice  = 0; indice <6; indice ++)
		System.out.println("posição " + indice + " = " + pessoas[indice]);
		
		System.err.println("\n");
		
		// como usar array sem declarar valor			
		for (int indice  = 0; indice <5; indice ++) {
			System.out.println("digite um valor para  posição  " +"["+ indice + "] = ");
			notas[indice] = leia.nextFloat();
		
		}
		for (int indice  = 0; indice < notas.length; indice ++)
			System.out.println("posição " + indice + " = " + notas[indice]);
			
		
		System.out.println("\n");
		
		// ordenar pessoas em ordem crescente
		Arrays.sort(pessoas);
		for (int indice  = 0; indice <pessoas.length; indice ++)
			System.out.println("posição [" + indice + "] = " + pessoas[indice]);

		System.out.println("\n");
		
		// ordenar pessoas em ordem decrescente
		for (int indice  = pessoas.length -1; indice >=0 ; indice --)
			System.out.println("posição [" + indice + "] = " + pessoas[indice]);
		
		System.out.println("\n");
		
		// como procurar o elemento
		System.out.println("Localize o elemento da posição da aline : " + Arrays.binarySearch(pessoas,"aline"));
		
		System.out.println("\n");
		
		// como procurar o array
		for (int indice  = 0; indice <pessoas.length; indice ++) {
			if (pessoas[indice].equalsIgnoreCase("Aline"))
				System.out.println("A aline está na posicação : " + indice);
			}
		
		System.out.println("\n");
		
		// jeito simples de percorrer array (for it)
		for(String pessoa : pessoas) {
			System.out.println(pessoa);
			
		}

	}

}
