package br.com.iw.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Motorista extends Pessoa implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 10)
	private String numetoCNH;

	public String getNumetoCNH() {
		return numetoCNH;
	}

	public void setNumetoCNH(String numetoCNH) {
		this.numetoCNH = numetoCNH;
	}
	
	

}
