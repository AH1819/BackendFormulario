package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Pais pais;
	private String Nombre;
	
	/*public Estado() {
		
	}
	public Estado(Pais pais, String nombre) {
		super();
		this.pais = pais;
		Nombre = nombre;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
}
