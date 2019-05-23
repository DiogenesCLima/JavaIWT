package depPessoal;

public class Pessoa {
	private String nome;
	private String endereco;
	private String email;
	private String celular;
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public Pessoa[] buscar() { return null;}
	public Pessoa[] buscar( String nome ) { return null;}
	public Pessoa[] buscar( int idade ) { return null;}
	public Pessoa[] buscar( String nome, boolean ativos ) { return null;}
}
