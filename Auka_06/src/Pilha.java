import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack <String> pilha = new Stack<String>();
		 pilha.add("aline");
		 pilha.add("Pedro");
		 pilha.add("Vinicius");
		 pilha.add("Luiza");
		 
		 System.out.println(pilha);
		 
		 
		 // retira o ultimo elemento adicionado na pilha
		 pilha.pop();
		 System.out.println(pilha);
		 
		 System.out.println(" elemento no topo da pilha " + pilha.peek()); // mostra o elemento no topo da pilha, a pilha sempre começa do ultimo pro primeiro
		 
		 System.out.println(" a Aline está na pilha? " + pilha.contains("aline"));
	

	}

}
