package com.UD25.EJ3.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cajas")
public class Caja {
	
	@Id
	@Column(name = "numref")
	private String numref;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name = "idAlmacen")
	private Almacen almacen;

	public Caja() {
		
	}

	

	public Caja(String numref, String contenido, int valor, Almacen almacen) {
		super();
		this.numref = numref;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	

	public String getNumref() {
		return numref;
	}



	public void setNumref(String numref) {
		this.numref = numref;
	}



	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	
	
	
}
