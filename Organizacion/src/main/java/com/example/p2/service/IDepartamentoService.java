package com.example.p2.service;

import java.util.List;

import com.example.p2.dto.Departamento;

public interface IDepartamentoService {
	
	//Metodos del CRUD
		public List<Departamento> listarDepartamentos(); //Listar All 
		
		public Departamento guardarDepartamento(Departamento departamento);	//Guarda un departamento CREATE
		
		public Departamento departamentoXCOD(int codigo); //Leer datos de un departamento READ
		
		public Departamento actualizarDepartamento(Departamento departamento); //Actualiza datos del departamento UPDATE
		
		public void eliminarDepartamento(int codigo);// Eliminar departamento DELETE
}
