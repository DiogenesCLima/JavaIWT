package br.com.iw.classes;

public class Endereco {
	private String logradouro;
	private int numero;
	
	public Endereco() {
		this.logradouro = "";
		this.numero = 0;		
	}

	public Endereco(String logradouro, int numero) {
		this.logradouro = logradouro;
		this.numero = numero;
	}

	public void setDados(String logradouro, int numero) {
		this.logradouro = logradouro;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + "]";
	}
	
}
