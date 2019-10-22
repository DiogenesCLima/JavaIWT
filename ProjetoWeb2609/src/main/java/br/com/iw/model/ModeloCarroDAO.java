package br.com.iw.model;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.iw.entity.ModeloCarro;


@Model
public class ModeloCarroDAO implements DAO{

		@PersistenceContext
		private EntityManager entityManager;
		
		@Override
		public void salvar(Object object) {
			entityManager.persist((ModeloCarro) object);
		}
		
		@Override
		public List<ModeloCarro> listar() {
			String query = "SELECT m FROM ModeloCarro m";
			TypedQuery<ModeloCarro> queryResult = entityManager.createQuery(query, ModeloCarro.class);
			List<ModeloCarro> modelocarros = queryResult.getResultList();
			return modelocarros;
		}
		
		@Override
		public Object buscarPorId(Long id) {
			ModeloCarro modelocarro = (ModeloCarro) entityManager.find(ModeloCarro.class, id);
			return modelocarro;
		}
		
		@Override
		public void atualizar(Object object) {
			entityManager.merge((ModeloCarro) object);
		}
		
		@Override
		public void deletar(Object object) {
			ModeloCarro modelocarro = (ModeloCarro) object;
			entityManager.remove(entityManager.getReference(ModeloCarro.class, modelocarro.getId()));	
		}
		
		public Object buscaFabricantePorID(Long id) {
			Query queryResult = entityManager.createQuery("SELECT m FROM ModeloCarro m INNER JOIN m.fabricante WHERE f.id = :id");
			queryResult.setParameter("id", id);
			return queryResult.getSingleResult();
		}
}
