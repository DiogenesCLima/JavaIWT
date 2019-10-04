package br.com.iw.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;

import br.com.iw.entity.Fabricante;
import br.com.iw.model.FabricanteDAO;

public class FabricanteService implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private FabricanteDAO fabricanteDAO;
	
	@Transactional
	public void salvar(Fabricante fabricante) throws BusinessException {
		if (StringUtils.isEmpty(fabricante.getNome())) {
			throw new BusinessException("O nome do fabricante é obrigatorio");
		}
		this.fabricanteDAO.salvar(fabricante);
	}
	
	public List<Fabricante> listar() {
		return this.fabricanteDAO.listar();
	}
	
	public Object bucarPorId(Long id) {
		return this.fabricanteDAO.buscarPorId(id);
	}
	
	@Transactional
	public void atualizar(Fabricante fabricante) {
		this.fabricanteDAO.atualizar(fabricante);
	}
	
	@Transactional
	public void deletar(Fabricante fabricante) {
		this.fabricanteDAO.deletar(fabricante);
	}

}
