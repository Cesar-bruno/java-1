package aula_metodos;

import static aula_metodos.pacote01.classe02.*;

import aula_metodos.pacote01.classe02;
public class testemetodos {

	public static void main(String[] args) {
		//chamadas para os métodos locais
		metodoPublico();
		metodoFriendly();
		metodoProtegido();
		metodoPrivate();
		
		//chamadas para os métodos da classe 01
		Classe01.metodoFriendly01();
		Classe01.metodoProtegido01();
		Classe01.metodoPublico01();
		
		//chamadas para os métodos da classe 02
		classe02.metodoPublico02();
		

	}
	public static void metodoPublico() {
		System.out.println("metodo publico");
		
	}
	static void metodoFriendly() {
		System.out.println("metodo Frindenly");
		
	}
	protected static void metodoProtegido() {
		System.out.println("metodo Protegido");
		
	}
	private static void metodoPrivate() {
		System.out.println("metodo privado");
		
	}
}