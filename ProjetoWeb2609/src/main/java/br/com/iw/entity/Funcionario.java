package br.com.iw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa{
	
	@Column(nullable = false, length = 20)
	private String matricula;
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
}
