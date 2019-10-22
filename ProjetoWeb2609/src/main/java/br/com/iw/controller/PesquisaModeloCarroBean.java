package br.com.iw.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.iw.entity.ModeloCarro;
import br.com.iw.service.BusinessException;
import br.com.iw.service.ModeloCarroService;
import br.com.iw.util.FacesMessages;

@Named
@ViewScoped
public class PesquisaModeloCarroBean implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private List<ModeloCarro> modeloCarros;
	
	private ModeloCarro modeloCarroSelecionado;
	
	@Inject
	private ModeloCarroService modeloCarroService;
	
	@Inject
	private FacesMessages facesMessages;
	
	public void inicializar() {
		this.modeloCarros = this.modeloCarroService.listar();
	}
	
	
	public void deletar() {
		try {
			modeloCarroService.deletar(modeloCarroSelecionado);
			this.modeloCarros.remove(modeloCarroSelecionado);
			facesMessages.info("Modelo " + modeloCarroSelecionado.getDescricao() + " exluido com sucesso!");
		} catch (BusinessException e) {
			facesMessages.error(e.getMessage());
		}
	}

	public List<ModeloCarro> getModeloCarros() {
		return this.modeloCarros;
	}


	public ModeloCarro getModeloCarroSelecionado() {
		return modeloCarroSelecionado;
	}


	public void setModeloCarroSelecionado(ModeloCarro modeloCarroSelecionado) {
		this.modeloCarroSelecionado = modeloCarroSelecionado;
	}
	
	
}