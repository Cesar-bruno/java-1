package aula_09;

public abstract class Funcionario {
	// atributos
	private String nome;
	private float salario;
	private int cargo;
	
	
	public Funcionario(String nome, float salario, int cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public int getCargo() {
		return cargo;
	}


	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	
	
	
		
		
	
	
	public void visualiar() {
		System.out.println("nome do funcionario : " + this.nome);
		System.out.println("cargo do funcionario : " + this.cargo);
		System.out.println("Salario do funcionario : " + this.salario);
		
	}

}
