package br.com.iw.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped
public class LoginBean {
	
	private String name;
	private String password;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String doLogin() {
		
		if ("aluno".equals(name) && "1234".equals(password)) {
			return "success";
		}
		
		FacesContext.getCurrentInstance().addMessage("form:button", new FacesMessage("Login Inválido!"));
		return null;
	}
}
