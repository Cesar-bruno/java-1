import java.util.Scanner;

public class pesquisa {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		 int idade,esporte, futebol = 0 , voleiM18 = 0 , basqueteMen18 = 0 , outros= 0 ;
		 String continua= "s";
		 
		 while(continua.equalsIgnoreCase("s")) {
			 System.out.println("Qual a sua idade?");
			 idade= leia.nextInt();
			 
			 do {
			 System.out.println("Digite seu esporte favorito : 1 - Fut / 2 - Vol / 3- Basq / 4- Outros");
			 esporte = leia.nextInt();
			 
			 }
			 while(esporte <1 || esporte > 5);
			 
			 // Quantas pessoas  gostam de Futte <
			 if (esporte == 1 )
				 futebol ++;
			 //Quantas pessoas gostam de volei e são maiores de 18
			 if (esporte == 2 && idade >=18 )
				 voleiM18 ++;
			 
			 // quantas pessoas gostam de basq  e são menores de 18 
			 if (esporte == 3 && idade <18 )
				 basqueteMen18 ++;
			 
			 // quantas pessoas gostam de outros esportes
			 if (esporte == 4  )
				 outros ++;
			 
			 System.out.println(" Deseja continuar? (s/n)");
			 leia.skip("\\r");// usado para não pular uma linha
			 continua = leia.nextLine().toUpperCase();	// converte letra minuscula para maisucla
		 }

	
		 System.out.println("total de pessoas que gostam de Futebol : " + futebol);
		 System.out.println("total de pessoas que gostam de Volei e são maiores de 18 : " + voleiM18);
		 System.out.println("total de pessoas que gostam de Basquete e são menores de 18 : " + basqueteMen18);
		 System.out.println("total de pessoas que gostam de outros esportes : " + outros);
	}

}
