package br.com.iw.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.iw.entity.Lancamento;

@Named
@RequestScoped
public class LancamentoService {
	
	@Inject
	private LancamentoDAO lancamentoDAO;
	
	@Transactional
	public void salvar(Lancamento lancamento) {
		this.lancamentoDAO.salvar(lancamento);
	}
	
	@Transactional
	public List<Lancamento> listar() {
		return this.lancamentoDAO.listar();
	}
	
	public Object buscarCodigoLancamento(Long codigo) {
		return this.lancamentoDAO.buscarporID(codigo);
	}
	
	public void atualizar(Lancamento lancamento) {
		this.lancamentoDAO.atualizar(lancamento);
	}
}
