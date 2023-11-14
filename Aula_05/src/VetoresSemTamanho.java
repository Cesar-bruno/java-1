import java.util.Scanner;

public class VetoresSemTamanho {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		float[] notas = new float[5];
		
		
		System.err.println("\n");
		
		for (int indice  = 0; indice <5; indice ++) {
			System.out.println("digite um valor para  posição  " +"["+ indice + "] = ");
			notas[indice] = leia.nextFloat();
		
		}
		for (int indice  = 0; indice < notas.length; indice ++)
			System.out.println("posição " + indice + " = " + notas[indice]);
			
	}

}
