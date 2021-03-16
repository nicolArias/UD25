package com.UD25.EJ3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25.EJ3.dao.IPeliculaDAO;
import com.UD25.EJ3.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	IPeliculaDAO peliculaDAO;
	
	@Override
	public List<Pelicula> listarPeliculas() {
		
		return peliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		
		return peliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(int id) {
		
		return peliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		
		return peliculaDAO.save(pelicula);
	}

	@Override
	public void borrarPelicula(int id) {
		peliculaDAO.deleteById(id);
		
	}

}
