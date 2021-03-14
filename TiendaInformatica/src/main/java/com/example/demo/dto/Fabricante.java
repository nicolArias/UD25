package com.example.demo.dto;

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
@Table(name="Fabricantes")
public class Fabricante {
	
	@Id //Revisar esta parte
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigoF")
	private int codigo;
	@Column(name="nombreF")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="codigoA")
	private List<Articulo> articulo;
	
	
	//Constructores
	public Fabricante() {}


	/**
	 * @param codigo
	 * @param nombre
	 */
	
	public Fabricante(int codigo,String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the articulo
	 */
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}


	/**
	 * @param articulo the articulo to set
	 */
	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}
	
	
	//Impresion datos por consola
	@Override
	public String toString() {
		return "Fabricante[codigo= "+codigo+",nombre= "+nombre+"]";
	}

}
