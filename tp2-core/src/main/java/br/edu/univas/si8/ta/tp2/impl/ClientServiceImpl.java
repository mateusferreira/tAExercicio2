package br.edu.univas.si8.ta.tp2.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.tp2.ejb.interfaces.Client;
import br.edu.univas.si8.ta.tp2.rest.api.Tp2Service;

@RequestScoped
public class ClientServiceImpl implements Tp2Service{
	
	@EJB(mappedName = "java:app/tp2-ejb-0.1-SNAPSHOT/ClientBean!br.edu.univas.si8.ta.tp2.ejb.interfaces.ClientRemote")
	private Client client;

	@Override
	public String[] listClientNames() {
		return client.listClientNames();
	}

	@Override
	public String saveNewClient(String name, String email) {
		client.createNewClient(name, email);
		return "{\"message\": \"Success\"}";
	}


}
