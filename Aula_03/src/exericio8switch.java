import java.util.Scanner;

public class exericio8switch {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		float valor;
		float saldo=1000;
		int operacao;
		
		System.out.println("1- Saldo");
		System.out.println("2- Saque");
		System.out.println("3- Depósito");
		operacao = leia.nextInt();
		
		
		switch(operacao) {
		
		case 1:
			System.out.println("Saldo da conta é:" + saldo);
			break;
		case 2:
			System.out.println("Informe o valor do saque");
			valor= leia.nextFloat();
				if(saldo >= valor)
					System.out.println("O novo saldo da conta é de : " + (saldo - valor));
				else
					System.out.println("saldo insuficiente");
				
			break;
		case 3:
			System.out.println("Informe o valor do deposito	");
			valor= leia.nextFloat();
				if(saldo > valor)
					System.out.println("O novo saldo da conta é de : " + (saldo + valor));
				break;
		default:
			System.out.println("escolha uma operacão valida");
			
		}

	}
}
