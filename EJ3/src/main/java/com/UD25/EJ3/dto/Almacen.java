package com.UD25.EJ3.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Almacenes")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "capacidad")
	private int capacidad;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Caja> caja;

	public Almacen() {
		
	}

	public Almacen(int id, String lugar, int capacidad, List<Caja> caja) {
	
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	//Anotaciones para evitar un bucle infinito
	public List<Caja> getCaja() {
		return caja;
	}

	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}
	
	
	
}
