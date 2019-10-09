package br.com.iw.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;

import br.com.iw.entity.Funcionario;
import br.com.iw.model.FuncionarioDAO;

public class FuncionarioService implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private FuncionarioDAO funcionarioDAO;
	
	@Transactional
	public void salvar(Funcionario funcionario) throws BusinessException {
		if (StringUtils.isEmpty(funcionario.getNome())) {
			throw new BusinessException("O nome do funcionario é obrigatorio");
		}
		this.funcionarioDAO.salvar(funcionario);
	}
	
	public List<Funcionario> listar() {
		return this.funcionarioDAO.listar();
	}
	
	public Object bucarPorId(Long id) {
		return this.funcionarioDAO.buscarPorId(id);
	}
	
	@Transactional
	public void atualizar(Funcionario funcionario) throws BusinessException{
		this.funcionarioDAO.atualizar(funcionario);
	}
	
	@Transactional
	public void deletar(Funcionario funcionario) {
		this.funcionarioDAO.deletar(funcionario);
	}

}
