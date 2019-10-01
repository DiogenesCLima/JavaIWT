package br.com.iw.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Aluguel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private Date dataPedido;
	
	@Column(nullable = false)
	private Date dataDevolucao;
	
	@Column(nullable = false)
	private double valorTotal;

	@Column(nullable = false)
	private long kmEntrega;
	
	@Column(nullable = false)
	private long kmDevolucao;
	
	@OneToOne
	private ApoliceSeguro apoliceSeguro;
	
	@ManyToOne
	private Carro carro;
	
	@ManyToOne
	private Motorista motorista;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public long getKmEntrega() {
		return kmEntrega;
	}

	public void setKmEntrega(long kmEntrega) {
		this.kmEntrega = kmEntrega;
	}

	public long getKmDevolucao() {
		return kmDevolucao;
	}

	public void setKmDevolucao(long kmDevolucao) {
		this.kmDevolucao = kmDevolucao;
	}

	public ApoliceSeguro getApoliceSeguro() {
		return apoliceSeguro;
	}

	public void setApoliceSeguro(ApoliceSeguro apoliceSeguro) {
		this.apoliceSeguro = apoliceSeguro;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	

}
