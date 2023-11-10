import java.util.Scanner;


public class Ex1While {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int idade = 0, menor21 = 0 , maior50=0;
		
		while(idade >= 0) {
			
		System.out.println("digite uma idade: ");
		idade = leia.nextInt();
		
		 
			 //pegando a idade entre 0 e 21
			 if( idade > 0 && idade <21)
				 menor21 ++;
			 //pegando a idade  50+
			 if (idade > 50)
				 maior50++;
			 
		}
	
		 System.out.println("O total de pessoas menores de 21 anos é de : " + menor21);
		 System.out.println("O total de pessoas maiores que 50 anos é de :" + maior50);

	}

}
