package aula_09;

public class Vendedor extends Funcionario implements CalcularSalario{
	private float comissao;
	
	public Vendedor(String nome, float salario, int cargo, float comissao) {
		super(nome, salario, cargo);
		this.comissao=comissao;
		
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public void visualiar() {
		super.visualiar();
		System.out.println("Comissão do funcionario : " + this.comissao);
		
	}

	@Override
	public float calcularSalario() {
		
		return (comissao * this.getSalario()) + this.getSalario();
	}


}
