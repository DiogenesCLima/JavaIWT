package br.com.iw.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import br.com.iw.entity.Despesa;



public class TableBean implements Serializable{
	
	private static List<Despesa> despesas = new ArrayList<Despesa>();
	
	private Despesa[] selectedDespesa;
	
	static {
		despesas = new ArrayList<Despesa>();
		despesas.add(new Despesa(1, "02/10/2019", "Restaurante Comida Boa", "Alimentação", 95.0));
		despesas.add(new Despesa(2, "03/10/2019", "Energia", "Casa", 200.0));
		despesas.add(new Despesa(3, "04/10/2019", "Salão de Beleza", "Estetica", 100.0));
		despesas.add(new Despesa(4, "05/10/2019", "Combustivel", "Automovel", 250.5));
		despesas.add(new Despesa(5, "06/10/2019", "Doce", "Alimentação", 40.4));
		despesas.add(new Despesa(6, "07/10/2019", "Livro", "Educação", 450.0));
		despesas.add(new Despesa(7, "08/10/2019", "Sapato", "Vestimenta", 298.0));
		despesas.add(new Despesa(8, "09/10/2019", "Uniforme Escolar", "Educação", 150.0));
		despesas.add(new Despesa(9, "10/10/2019", "internet", "Utilidade", 140.0));
	}
	
	public void processar() {
		StringBuilder sb = new StringBuilder("Despesas selecionadas: ");
		for (Despesa d : selectedDespesa) {
			sb.append(d.getDescricao()).append(", ");
		}
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Despesa " + sb.toString(), null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void onEdit(RowEditEvent event) {
		Despesa d = (Despesa) event.getObject();
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Despesa " + d.getId() + " Alterada", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void onCancel(RowEditEvent event) {
		Despesa d = (Despesa) event.getObject();
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alteração na despesa " + d.getId() + " Cancelada", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<Despesa> getDespesas() {
		return despesas;
	}

	public Despesa[] getSelectedDespesa() {
		return selectedDespesa;
	}

	public void setSelectedDespesa(Despesa[] selectedDespesa) {
		this.selectedDespesa = selectedDespesa;
	}
	
	
}

