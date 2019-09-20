package br.com.iw.mapeamento07;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Acidente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codSinistro;
	
	private Date data;
	private String local;
	
	@ManyToOne
	private Carro carro;
	
	

	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public int getCodSinistro() {
		return codSinistro;
	}
	public void setCodSinistro(int codSinistro) {
		this.codSinistro = codSinistro;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
}
