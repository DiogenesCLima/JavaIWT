package br.com.iw.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.iw.entity.Lancamento;

@Named
@RequestScoped
public class ConsultaLancamentoBean  implements Serializable {

		@Inject
		private lancamentoService lancamentoService;
		
		@Inject
		private ViewsRouter viewsRouter;
		
		private Lancamento lancamento;
		
		public void salvar() {
			this.lancamentoService.salvar(lancamento);
			FacesUtil.addSuccessMessage("Lançamento Cadastro com Sucesso!");
			this.limpar();
		}
		
		public List<Lancamento> listar() {
			return this.lancamentoService.listar();			
		}
		
		public String editarLancamento(Long codigo) {
			this.lancamento = (Lancamento) this.lancamentoService.buscarCodigoLancamento(codigo);
			return viewsRouter.getEditarLancamento();
		}
		
		public void atualizar(Lancamento lancamento) {
			this.lancamentoService.atualizar(lancamento);
			FacesUtil.addSuccessMessage("Lançamento Editado com Sucesso!");
			this.limpar();
		}
}
