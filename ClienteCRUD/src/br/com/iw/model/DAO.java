package br.com.iw.model;

import java.util.List;

public interface DAO {
	
	public void cadastrar(Object object);

	public void atualizar(Object object);
	  
	public List<?> listar();
	  
	public void excluir(Object object);
	 
}
