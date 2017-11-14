package br.edu.univas.si8.ta.tp2.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.tp2.ejb.entities.Cliente;


@Stateless
public class ClientDAO {
	
	@PersistenceContext(unitName = "cliente")
	private EntityManager em;

	public void insert(Cliente client) {
		em.persist(client);
	}

	public List<Cliente> listAll() {
		return em.createQuery("from Cliente c", Cliente.class).getResultList();
	}

}
