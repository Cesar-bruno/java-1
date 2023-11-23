package aula_09;

public class testaFuncionario {

	public static void main(String[] args) {
	
		Gerente f1=  new Gerente("Bruno " ,  4500.00f, 1, 1000.00f);
		System.out.println("salario calculado : " + f1.calcularSalario());
		
		Vendedor v1 =  new Vendedor( "Brunim",  2500.00f ,1, 0.10f);
		System.out.println("salario calculado : " + v1.calcularSalario());

	}

}
