package br.com.iw.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.iw.entity.Motorista;
import br.com.iw.entity.Sexo;
import br.com.iw.service.BusinessException;
import br.com.iw.service.MotoristaService;
import br.com.iw.util.FacesMessages;

@Named
@ViewScoped
public class EditarMotoristaBean  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Motorista motorista;
	
	@Inject
	private MotoristaService motoristaService;
	
	@Inject
	private FacesMessages facesMessages;
	
	private List<Sexo> sexos;
	
	public void inicializar() {
		this.sexos = Arrays.asList(Sexo.values());
	}

	public void atualizar() throws BusinessException {
		try {
			motoristaService.atualizar(motorista);
			facesMessages.info("Motorista atualizado com sucesso!");
		} catch (BusinessException e) {
			facesMessages.error(e.getMessage());
		}
		
		this.limpar();
	}
	
	public void editarMotorista(Long id) {
		this.motorista = (Motorista) this.motoristaService.bucarPorId(id);
	}
	
	
	private void limpar() {
		this.motorista = new Motorista();
	}

	public List<Sexo> getSexos() {
		return sexos;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	
}
