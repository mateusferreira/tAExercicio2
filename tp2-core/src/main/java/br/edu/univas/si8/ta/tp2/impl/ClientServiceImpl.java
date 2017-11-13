package br.edu.univas.si8.ta.tp2.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.tp2.ejb.interfaces.Client;
import br.edu.univas.si8.ta.tp2.rest.api.Tp2Service;

public class ClientServiceImpl implements Tp2Service{
	@EJB(mappedName = "java:app/hello-rest-ejb-0.1-SNAPSHOT/InventoryBean!br.edu.univas.si8.ta.hello.ejb.interfaces.InventoryRemote")
	
	private Client client;

	@Override
	public String[] listClientNames() {
		return client.listClientNames();
	}

	@Override
	public String saveNewClient(String name, String email) {
		client.createNewClient(name);
		return "{\"message\": \"Success\"}";
	}


}
