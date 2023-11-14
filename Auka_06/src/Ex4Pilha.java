
import java.util.Scanner;
import java.util.Stack;

public class Ex4Pilha {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		Stack <String> fila = new Stack<String> ();
		 int opcao;
		 String nome;
		 
		 while(true) {
		 	System.out.println("********************************************");
			System.out.println("                                            ");
			System.out.println("          Digite a opção desejada          ");
			System.out.println("1 : Adicionar Livro na pilhaa.");
			System.out.println("2 : Listar todos os livros da pilha.");
			System.out.println("3 : Retirar livro da fila.");
			System.out.println("0 : Sair");
			System.out.println("                                             ");
			System.out.println("******************************************** ");
			System.out.println("                                             ");
				opcao = leia.nextInt();
		 
				if (opcao == 0 )
				{	System.out.println(" programa finalizado");		
					System.exit(0);
				}
				
			switch (opcao) {
			
			case 1:
				System.out.println("\nDigite o nome do livro  que deseja adicionar : ");
				leia.skip("\\R");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Livro adicionado");
				break;
				
			case 2 :
				System.out.println("Esses livros  ainda estão na pilha : ");
				fila.forEach(System.out::println);
				break;
				
			case 3 :
				
				if (fila.isEmpty()) 
					System.out.println("A pilha está vazia ");
				else {
				fila.pop();
				System.out.println("O livro foi  retirado da fila.");
				}
				break;
				
					
			default :
				System.out.println("Escolha uma opção valida");
			
			}
		 }

	}

}
