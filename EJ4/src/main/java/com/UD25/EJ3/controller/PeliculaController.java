package com.UD25.EJ3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UD25.EJ3.dto.Pelicula;
import com.UD25.EJ3.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/ud25")
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl peliculaService;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaService.listarPeliculas();
	}
	
	@PostMapping("/pelicula")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
		return peliculaService.guardarPelicula(pelicula);
	}
	
	@GetMapping("/pelicula/{id}")
	public Pelicula peliculaXID(@PathVariable(name = "id") int id) {
		return peliculaService.peliculaXID(id);
	}
	
	@PutMapping("/pelicula/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name = "id") int id, @RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_s = new Pelicula();
		Pelicula pelicula_a = new Pelicula();
		
		pelicula_s = peliculaService.peliculaXID(id);
		
		pelicula_s.setNombre(pelicula.getNombre());
		pelicula_s.setCalificacionEdad(pelicula.getCalificacionEdad());
		
		pelicula_a = peliculaService.actualizarPelicula(pelicula_s);
		
		return pelicula_a;
	}
	
	@DeleteMapping("/pelicula/{id}")
	public void eliminarPelicula(@PathVariable(name = "id") int id) {
		peliculaService.borrarPelicula(id);
	}
}
