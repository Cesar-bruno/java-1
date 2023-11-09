import java.util.Scanner;

public class exercicio2switch {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	String nome;
	int codigo;
	float salario;
	double novosalario;
	
		System.out.println("digite o nome do colaborador");
		nome = leia.nextLine();
		
		System.out.println("digite o salário do colaborador");
		salario = leia.nextFloat();
				
		System.out.println(" agora digite o código do colaborador");
		System.out.println("1 = Gerente");
		System.out.println("2 = vendedor");
		System.out.println("3 = Supervisor");
		System.out.println("4 = Motorista");
		System.out.println("5 = Estoquista");
		System.out.println("6 = Tecnico de T.i");
		codigo= leia.nextInt();
		
		switch(codigo) {
		
		case 1:
			novosalario =  (salario + ( 0.1 * salario));
			System.out.printf("%s,seu novo salário de Gerente será de R$%.2f" ,nome,  novosalario);
			break;
		case 2:
			novosalario =  (salario + ( 0.07 * salario));
			System.out.printf("%s,seu novo salário de Vendedor será de R$%.2f" , novosalario);
			break;
		case 3:
			novosalario =  (salario + ( 0.09 * salario));
			System.out.printf("%s,seu novo salário de Supervisor será de R$%.2f" , novosalario);
			break;
		case 4:
			novosalario =  (salario + ( 0.06 * salario));
			System.out.printf("%s,seu novo salário de Motorista será de R$%.2f" , novosalario);
			break;
			
		case 5:
			novosalario =  (salario + ( 0.05 * salario));
			System.out.printf("%s,seu novo salário de Estoquista será de R$%.2f" , novosalario);
			break;
		case 6:
			novosalario =  (salario + ( 0.08 * salario));
			System.out.printf("%s,seu novo salário de Tecnico de T.i será de R$%.2f" , novosalario);
			break;
		default:
			System.out.println("Selecione um cargo Valido");
		
		
		}
		
	}

}
