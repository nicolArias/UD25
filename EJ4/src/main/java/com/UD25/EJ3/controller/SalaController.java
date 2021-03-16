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

import com.UD25.EJ3.dto.Sala;
import com.UD25.EJ3.service.SalaServiceImpl;

@RestController
@RequestMapping("/ud25")
public class SalaController {

	@Autowired
	SalaServiceImpl salaService;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return salaService.listarSalas();
	}
	
	@PostMapping("/sala")
	public Sala guardarSala(@RequestBody Sala sala) {
		return salaService.guardarSala(sala);
	}
	
	@GetMapping("/sala/{id}")
	public Sala salaXID(@PathVariable(name = "id") int id) {
		return salaService.salaXID(id);
	}
	
	@PutMapping("/sala/{id}")
	public Sala actualizarSala(@PathVariable(name = "id") int id, @RequestBody Sala sala) {
		
		Sala sala_s = new Sala();
		Sala sala_a = new Sala();
		
		sala_s = salaService.salaXID(id);
		
		sala_s.setNombre(sala.getNombre());
		sala_s.setPelicula(sala.getPelicula());
		
		sala_a = salaService.actualizarSala(sala_s);
		
		return sala_a;
	}
	
	@DeleteMapping("/sala/{id}")
	public void borrarSala(@PathVariable(name = "id") int id) {
		salaService.borrarSala(id);
	}
}
