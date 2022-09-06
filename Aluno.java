package saveXMLorJSON;

public class Aluno extends Pessoa {
	private String matricula;
	private String cpf;
	private String nascimento;
	private String email;
	
	public Aluno() {
		
	}
	
	public Aluno(String matricula, String cpf, String nascimento, String email) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
