package br.com.iw.controler;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.iw.entity.Cliente;
import br.com.iw.model.ConsultasDAO;

@Named
@RequestScoped
public class ConsultasBean {

	@Inject
	private ConsultasDAO consultasDAO;
	
	public List<Cliente> listar1(){
		return this.consultasDAO.listar1();
	}
	
	
}
