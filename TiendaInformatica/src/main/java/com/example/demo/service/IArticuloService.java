package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Articulo;

public interface IArticuloService {

	// Metodos del CRUD
	public List<Articulo> listarArticulos(); // Listar All

	public Articulo guardarArticulo(Articulo articulo); // Guarda un articulo CREATE

	public Articulo articuloXCOD(int codigo); // Leer datos de un articulo READ

	public Articulo actualizarArticulo(Articulo articulo); // Actualiza datos del articulo UPDATE

	public void eliminarArticulo(int codigo);// Elimina el articulo DELETE
}
