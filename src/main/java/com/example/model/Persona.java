package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Nombre;
	private String Apellido;
	private String Edad;
	
	@ManyToOne
	@JoinColumn(name = "pais_id")
	private Pais pais;
	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado estado;
	
	/*public Persona() {
		
	}

	public Persona(String nombre, String apellido, String edad, Pais pais, Estado estado) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		this.pais = pais;
		this.estado = estado;
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
