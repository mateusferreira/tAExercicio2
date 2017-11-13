package br.edu.univas.si8.ta.tp2.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.tp2.ejb.entities.Clientes;


@Stateless
public class ClientDAO {
	
	@PersistenceContext(unitName = "estoque")
	private EntityManager em;

	public void insert(Clientes client) {
		em.persist(client);
	}

	public List<Clientes> listAll() {
		return em.createQuery("from products p", Clientes.class).getResultList();
	}

}
