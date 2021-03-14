package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Fabricante;

public interface IFabricanteService {
	//Metodos del CRUD
		public List<Fabricante> listarFabricantes(); //Listar All 
		
		public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
		
		public Fabricante fabricanteXCOD(int codigo); //Leer datos de un fabricante READ
		
		public Fabricante actualizarFabricante(Fabricante cliente); //Actualiza datos del fabricante UPDATE
		
		public void eliminarFabricante(int codigo);// Elimina el fabricante DELETE
}
