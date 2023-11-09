import java.util.Scanner;

public class Exercicio1Switch {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int  codigo;
		float valor;
		float quantidade;
		System.out.println("Digite o código do produto escolhido:");
		System.out.println("1 : Cachorro quente : R$10,00");
		System.out.println("2 : X-salada : R$15,00");
		System.out.println("3 : X-Bacon : R$18,00");
		System.out.println("4 : Bauru : R$12,00");
		System.out.println("5 : Refrigerante: R$8,00");
		System.out.println("6 : Suco de laranja : R$13,00");
		codigo = leia.nextInt();
		System.out.println("Agora digite a quantidade que deseja:");
		quantidade = leia.nextFloat();
		
		switch(codigo) {
		case 1:	
			valor = quantidade * 10;
			System.out.printf(" você escolheu %.0f Cachorros Quentes e ficou num valor de R$%.2f", quantidade , valor);
			break;
		case 2:	
			valor = quantidade * 15;
			System.out.printf(" você escolheu %.0f X-Saladas e ficou num valor de R$%.2f", quantidade , valor);
			break;
		case 3:	
			valor = quantidade * 18;
			System.out.printf(" você escolheu %.0fX-Bacon e ficou num valor de R$%s", quantidade , valor);
			break;
		case 4:	
			valor = quantidade * 18;
			System.out.printf(" você escolheu %.0f Bauru e ficou num valor de R$%s", quantidade , valor);
			break;
		case 5:	
			valor = quantidade * 18;
			System.out.printf(" você escolheu %.0f Refrigerantes e ficou num valor de R$%s", quantidade , valor);
			break;
		case 6:	
			valor = quantidade * 18;
			System.out.printf(" você escolheu %.0f Sucos de Laranja e ficou num valor de R$%s", quantidade , valor);
			break;
		default:
			System.out.println("escolha um item válido");
				
		}
		
	}

}
