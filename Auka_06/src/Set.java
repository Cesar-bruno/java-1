import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		
		HashSet<String> frutas = new HashSet <String>();
		frutas.add("laranja");
		frutas.add("banana");
		frutas.add("laranja");
		frutas.add("abacate");
		frutas.add("morango");
		frutas.add("jaboticada");
		frutas.add("kiwi");
		
		System.out.println(frutas);
		
		// exibe as posições em códigos
		for(var fruta : frutas)
			System.out.println(fruta.hashCode());
		
		 //checar se um elemnto existe
		 System.out.println(" posição do elemento 7 : " + frutas.contains("laranja"));
		
		 //remove um indice desejado
		 frutas.remove("morango");
		System.out.println(frutas);
		
		//
		Iterator < String > iFrutas =   frutas.iterator();
		while(iFrutas.hasNext())
			System.out.println(iFrutas.next());
		
		// como deixar o set em ordem
		
		ArrayList<String> frutasList = new ArrayList<String> ();// criamos o array list
		frutasList.addAll(frutas); // adicionar todos os elementos do Hashset no array
		frutasList.sort(null); // ordenar em ordem crescente
		System.out.println(frutasList);// exibir a ordem
		frutasList.sort(Comparator.reverseOrder());// deixa a list em ordem inversa
		System.out.println(frutasList);// exibe a lista
		
	}

}
