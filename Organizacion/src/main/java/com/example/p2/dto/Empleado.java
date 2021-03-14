package com.example.p2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Empleados")
public class Empleado {
	
	//Atributos de la entidad Empleado
	@Id
	@Column(name="dni")
	private String dni;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;

	@ManyToOne
	@JoinColumn(name="departamento_cod")
	private Departamento departamento_fk;
	
	//Constructores
	
	public Empleado() {}
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param departamento
	 */
	public Empleado(String dni,String nombre,String apellidos,Departamento dep) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.departamento_fk=dep;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the departamento_fk
	 */
	public Departamento getDepartamento_fk() {
		return departamento_fk;
	}

	/**
	 * @param departamento_fk the departamento_fk to set
	 */
	public void setDepartamento_fk(Departamento departamento_fk) {
		this.departamento_fk = departamento_fk;
	}
	
	//Metodo toString 
	@Override
	public String toString() {
		return "Empleado [dni= "+dni+", nombre= "+nombre+", apellidos= "+apellidos+", departamento= "+departamento_fk+"]";
	}
}
