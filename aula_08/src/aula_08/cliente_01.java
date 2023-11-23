package aula_08;

public class cliente_01 {	
	
	private String nome;
	private int login;
	private int idade;
	private int sexo;
	private int cpf;
	
	// criado metodo construtor
	public cliente_01(String nome, int login, int idade, int sexo, int cpf) {
		
		this.nome = nome;
		this.login = login;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		String sexo = "";
		switch(this.sexo) {
		case 1 -> sexo = " Masculino" ;
		case 2 -> sexo = " Feminino " ;
		
		}
		
		System.out.println("\n\n ***********************");
		System.out.println("Dados do Cliente");
		System.out.println("\n\n ***********************");
		System.out.println(" número do cliente : " + this.login);
		System.out.println(" Nome do Cliente : " + this.nome);
		System.out.println(" Cpf do cliente : " + this.cpf);
		System.out.println(" Sexo do cliente : " + sexo);
		System.out.println(" Idade do Cliente : " + this.idade);
		
	}
	
}
