package model;

public abstract class Pessoa {

	public String nome;
	private String cpf;
	protected String sexo;
	
	public Pessoa(String nome, String cpf, String sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + "]";
	}
	
}
