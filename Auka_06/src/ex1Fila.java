import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex1Fila {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		 Queue <String> fila = new LinkedList<String> ();
		 int opcao;
		 String nome;
		 
		 while(true) {
		 	System.out.println("********************************************");
			System.out.println("                                            ");
			System.out.println("          Digite a opção desejada          ");
			System.out.println("1 : Adicionar cliente na Fila.");
			System.out.println("2 : Listar todos os clientes adicionados.");
			System.out.println("3 : Retirar cliente da fila.");
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
				System.out.println("\nDigite o nome do Cliente que deseja adicionar : ");
				leia.skip("\\R");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("cliente adicionado");
				break;
				
			case 2 :
				System.out.println("Essas pessoas ainda estão na fila : ");
				fila.forEach(System.out::println);
				break;
				
			case 3 :
				
				if (fila.isEmpty()) 
					System.out.println("A fila está vazia ");
				else {
				fila.remove();
				System.out.println("Cliente retirado da fila.");
				}
				break;
				
					
			default :
				System.out.println("Escolha uma opção valida");
			
			}
		 }
	}
		 
}
