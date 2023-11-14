
import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList <Double> notas = new ArrayList < Double > ();
		 notas.add(7.0);
		 notas.add(4.0);
		 notas.add(6.0);
		 notas.add(7.0);
		 notas.add(9.0);
		 
		 // var identifica automaticamente qual a variavel que estamos falando, se é double, int, float..
		 for (var nota :notas)
			 System.out.println(nota);
		 
		 // indexof, devolve  a posição sempre do primeiro elemento
		 System.out.println(" posição do elemento 7 : " + notas.indexOf(7.0));
		 
		 //checar se um elemnto existe
		 System.out.println(" posição do elemento 7 : " + notas.contains(7.0));
		 
		 // pegar o elemento da posição 0
		 System.out.println(" posição do elemento 7 : " + notas.get(0));
		 
		 //remove um indice desejado
		 notas.remove(3);
		System.out.println(notas);
		
		//mostrar na tela o indice de forma mais fácil ( substitui o for do começo)
		notas.forEach(System.out::println);
		
		// limpa a lista 
		notas.clear();
		
		//verifica se a matriz está vazia ou não
		System.out.println("A lista está vazia? " + notas.isEmpty());
		
		
	}

}
