package vendas;

import depPessoal.Funcionario;
import depPessoal.Pessoa;
import estoque.Produto;

public class Venda {
	private Pessoa vendedor;
	private Pessoa cliente;
	private Pessoa gerenteAutDesconto;
	private Produto produto;
	private int quantidade;
	private double preco;
	
	
	public Pessoa getVendedor() {
		return vendedor;
	}
	public void setVendedor(Pessoa vendedor) {
		this.vendedor = vendedor;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public Pessoa getGerenteAutDesconto() {
		return gerenteAutDesconto;
	}
	public void setGerenteAutDesconto(Pessoa gerenteAutDesconto) {
		this.gerenteAutDesconto = gerenteAutDesconto;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void Vender() {
		Funcionario vendedor = new Funcionario();
		vendedor.setNome("Francisco");
	}
}
