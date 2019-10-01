package br.com.iw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Motorista extends Pessoa {
	
	@Column(nullable = false, length = 10)
	private String numetoCNH;

	public String getNumetoCNH() {
		return numetoCNH;
	}

	public void setNumetoCNH(String numetoCNH) {
		this.numetoCNH = numetoCNH;
	}
	
	

}
