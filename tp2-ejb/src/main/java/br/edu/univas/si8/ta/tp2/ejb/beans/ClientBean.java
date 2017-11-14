package br.edu.univas.si8.ta.tp2.ejb.beans;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si8.ta.tp2.ejb.dao.ClientDAO;
import br.edu.univas.si8.ta.tp2.ejb.entities.Cliente;
import br.edu.univas.si8.ta.tp2.ejb.interfaces.ClientLocal;
import br.edu.univas.si8.ta.tp2.ejb.interfaces.ClientRemote;



@Stateless
@Local(ClientLocal.class)
@Remote(ClientRemote.class)

public class ClientBean implements ClientLocal, ClientRemote {
	
	@EJB
	private ClientDAO dao;

	@Override
	public void createNewClient(String clientName, String clientEmail) {
		Cliente client = new Cliente();
		client.setName(clientName);
		client.setEmail(clientEmail);
		dao.insert(client);
	}

	@Override
	public String[] listClientNames() {
		return dao.listAll()
				.stream()
				.map(Cliente::getName)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

}
