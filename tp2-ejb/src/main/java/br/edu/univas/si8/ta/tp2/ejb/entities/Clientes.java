package br.edu.univas.si8.ta.tp2.ejb.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Clientes {
	@Id
	@GeneratedValue(generator = "seq_cliente", strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String name;
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}