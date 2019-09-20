package br.com.iw.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.iw.entity.Cliente;

public class ConsultasDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Cliente> listar1() {
		Query queryResult = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.nome = :nome");
		queryResult.setParameter("nome", "Tio Patinhas");
		List<Cliente> clientes = queryResult.getResultList();
		return clientes;
	}
}
