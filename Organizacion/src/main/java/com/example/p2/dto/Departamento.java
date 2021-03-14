package com.example.p2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Departamentos")
public class Departamento {
	
	//Atributos
	@Id
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="presupuesto")
	private int presupuesto;
	
	
	@OneToMany
	@JoinColumn(name="dni")
	private List<Empleado> empleado;

	
	//Constructores
	public Departamento() {}
	
	
	/**
	 * @param codigo
	 * @param nombre
	 * @param presupuesto
	 */
	
	public Departamento(int codigo,String nombre,int presupuesto) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.presupuesto=presupuesto;
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
	 * @return the presupuesto
	 */
	public int getPresupuesto() {
		return presupuesto;
	}


	/**
	 * @param presupuesto the presupuesto to set
	 */
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}


	/**
	 * @return the empleado
	 */
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="Empleados")
	public List<Empleado> getEmpleado() {
		return empleado;
	}


	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Departamento [codigo= "+codigo+", nombre= "+nombre+", presupuesto= "+presupuesto+"]";
	}
	
}
