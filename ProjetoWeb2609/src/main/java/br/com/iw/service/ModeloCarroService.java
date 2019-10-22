package br.com.iw.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;

import br.com.iw.entity.ModeloCarro;
import br.com.iw.model.ModeloCarroDAO;

public class ModeloCarroService implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ModeloCarroDAO modeloCarroDAO;
	
	@Transactional
	public void salvar(ModeloCarro modeloCarro) throws BusinessException {
		this.validar(modeloCarro);
		this.modeloCarroDAO.salvar(modeloCarro);
	}
	
	public List<ModeloCarro> listar() {
		return this.modeloCarroDAO.listar();
	}
	
	public Object bucarPorId(Long id) {
		return this.modeloCarroDAO.buscarPorId(id);
	}
	
	public Object buscarFabricantePorID(Long id) {
		return this.buscarFabricantePorID(id);
	}
	
	@Transactional
	public void atualizar(ModeloCarro modeloCarro) throws BusinessException{
		this.modeloCarroDAO.atualizar(modeloCarro);
	}
	
	@Transactional
	public void deletar(ModeloCarro modeloCarro) throws BusinessException {
		this.modeloCarroDAO.deletar(modeloCarro);
	}
	
	private void validar(ModeloCarro modeloCarro) throws BusinessException {
		if (StringUtils.isBlank(modeloCarro.getDescricao())) {
			throw new BusinessException("O nome do modelo é obrigatorio.");
		}
		
		if (modeloCarro.getFabricante() == null) {
			throw new BusinessException("O fabricante é obrigatorio");
		}
	}
	
}
