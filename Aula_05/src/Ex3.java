import java.util.Scanner;

public class Ex3 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		float[][] notas = new float [10][4];
		float[] media = new float[10];
		float soma= 0.0f;
		
		//fazer leita das notas
		for (int i =0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("digite a " + (j + 1) + "º nota do participante " + (i + 1) +  ":");	
				notas[i][j] = leia.nextFloat();
			}
		}
		
		// fazer a somatoria das colunas pra media
		for (int i =0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				soma += notas [i][j];
									
			}
			media[i] = soma / notas[i].length;
			soma = 0.0f;
		}
		
		// mostrar a média na tela
		for(int i = 0; i < media.length; i++) {
			System.out.println("\nMédia do participante " + (i + 1) + ": " + media[i]);
		}
		

	}

}
