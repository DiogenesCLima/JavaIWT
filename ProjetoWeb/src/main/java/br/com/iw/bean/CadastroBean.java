package br.com.iw.bean;

import java.io.Serializable;
import java.util.Iterator;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.iw.model.Linguagem;

@Named
@RequestScoped
public class CadastroBean implements Serializable {

	private String nome;
	private String email;
	private String senha1;
	private String senha2;
	private String sexo;
	private String observacoes;
	private Boolean receberEmails;
	private Integer[] linguagens;
	
	
	public Linguagem[] getListalinguagens() {
		return Linguagem.LINGUAGENS;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha1() {
		return senha1;
	}
	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}
	public String getSenha2() {
		return senha2;
	}
	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Boolean getReceberEmails() {
		return receberEmails;
	}
	public void setReceberEmails(Boolean receberEmails) {
		this.receberEmails = receberEmails;
	}
	public Integer[] getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}
	
	public String getLinguagensAsString() {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for ( Integer linguagem : linguagens) {
			if (!first) {
				sb.append(",");
			}
			sb.append(linguagem);
			first = false;
		}
		return sb.toString();
	}
	
}
