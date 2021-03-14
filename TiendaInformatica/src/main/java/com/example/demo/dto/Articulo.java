package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Articulos")
public class Articulo {
	
	//Atributos entidad Articulos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigoA")
	private int codigo;
	
	@Column(name="nombreA")
	private String nombre;
	@Column(name="precio")
	private int precio;
	
	@ManyToOne
	@JoinColumn(name="fabricante_cod")
	private Fabricante fabricante_fk;
	
	//Constructores
	public Articulo() {}
	
	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @fabricante_fk  
	 */
	
	public Articulo(int codigo,String nombre,int precio,Fabricante fabricante) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
		this.fabricante_fk=fabricante;
	}

	
	//GETTER Y SETTER
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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	/**
	 * @return the fabricante_fk
	 */
	public Fabricante getFabricante_fk() {
		return fabricante_fk;
	}

	/**
	 * @param fabricante_fk the fabricante_fk to set
	 */
	public void setFabricante_fk(Fabricante fabricante_fk) {
		this.fabricante_fk = fabricante_fk;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Articulo [codigo= "+codigo+", nombre= "+nombre+", precio= "+precio+", Fabricante= "+fabricante_fk+"]";
	}
	
	
	
}
