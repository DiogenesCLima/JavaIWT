package br.com.iw.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.iw.entity.Funcionario;
import br.com.iw.entity.Sexo;
import br.com.iw.service.BusinessException;
import br.com.iw.service.FuncionarioService;
import br.com.iw.util.FacesMessages;

@Named
@ViewScoped
public class EditarFuncionarioBean  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Funcionario funcionario;
	
	@Inject
	private FuncionarioService funcionarioService;
	
	@Inject
	private FacesMessages facesMessages;
	
	private List<Sexo> sexos;
	
	public void inicializar() {
		this.sexos = Arrays.asList(Sexo.values());
	}

	public void atualizar() throws BusinessException {
		try {
			funcionarioService.atualizar(funcionario);
			facesMessages.info("Funcionario atualizado com sucesso!");
		} catch (BusinessException e) {
			facesMessages.error(e.getMessage());
		}
		
		this.limpar();
	}
	
	public void editarFuncionario(Long id) {
		this.funcionario = (Funcionario) this.funcionarioService.bucarPorId(id);
	}
	
	
	private void limpar() {
		this.funcionario = new Funcionario();
	}

	public List<Sexo> getSexos() {
		return sexos;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
