import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue <String> fila = new LinkedList<String> ();
		
		fila.add("aline");
		fila.add("Pedro");		
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("maria");
		System.out.println(fila);
		
		//remove o primeiro elemento da fila
		fila.remove();
		System.out.println(fila);

		// mostra apenas o primeiro elemento da fila
		System.out.println(fila.peek());
		
		//mmostra o primeiro elemento, mas retira ele da fila
		System.out.println(fila.poll());
		System.out.println(fila);
		
		//verifica se o elemento está na fila
		System.out.println("A Maria está na fila? " + fila.contains("maria"));
		
		// verifica quantos elementos tem na fila
		System.out.println("Número de elementos na fila " + fila.size());
		
		
	}


}
