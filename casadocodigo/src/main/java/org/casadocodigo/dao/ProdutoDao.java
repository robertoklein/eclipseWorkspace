package org.casadocodigo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.casadocodigo.models.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProdutoDao {

	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Produto produto){
		manager.persist(produto);
	}
}
