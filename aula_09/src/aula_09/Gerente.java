package aula_09;

public class Gerente extends Funcionario implements CalcularSalario{
	
	
	private float bonus;
	
	public Gerente(String nome, float salario, int cargo, float bonus) {
		super(nome, salario, cargo);
		this.bonus = bonus;
		
	}


	
	@Override
	public void visualiar() {
		super.visualiar();
		System.out.println("Comissão do funcionario : " + this.bonus);
		
	}



	public float getBonus() {
		return bonus;
	}



	public void setBonus(float bonus) {
		this.bonus = bonus;
	}



	@Override
	public float calcularSalario() {
		return this.getSalario() + bonus;
	}
}
