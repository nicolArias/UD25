package com.UD25.EJ3.service;

import java.util.List;

import com.UD25.EJ3.dto.Pelicula;

public interface IPeliculaService {
	
	public List<Pelicula> listarPeliculas();
	
	public Pelicula guardarPelicula(Pelicula pelicula);
	
	public Pelicula peliculaXID(int id);
	
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void borrarPelicula(int id);
}
