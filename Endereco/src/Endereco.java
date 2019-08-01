
public class Endereco {
	private String endereco;
	private int numero;
	
		
	public Endereco() {
		this.endereco = "";
		this.numero = 0;
	}

	public Endereco(String endereco, int numero) {
		this.endereco = endereco;
		this.numero = numero;
	}

	public void setDados(String endereco, int numero) {
		this.endereco = endereco;
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public int getNumero() {
		return numero;
	}

	public String toString() {
		return "Endereco [endereco=" + endereco + ", numero=" + numero + "]";
	}


			
}
