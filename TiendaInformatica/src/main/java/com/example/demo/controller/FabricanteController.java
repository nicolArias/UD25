package com.example.demo.controller;


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

import com.example.demo.dto.Fabricante;
import com.example.demo.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/tiendaInformatica")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante salvarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{codigo}")
	public Fabricante fabricanteXCOD(@PathVariable(name="codigo") int codigo) {
		
		Fabricante fabricante_xcod=new Fabricante();
		
		fabricante_xcod=fabricanteServiceImpl.fabricanteXCOD(codigo);
		
		return fabricante_xcod;
	}
	
	@PutMapping("/fabricantes/{codigo}")
	public Fabricante actualizarFabricante(@PathVariable(name="codigo")int codigo,@RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado= new Fabricante();
		Fabricante fabricante_actualizado= new Fabricante();
		
		fabricante_seleccionado= fabricanteServiceImpl.fabricanteXCOD(codigo);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		
		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{codigo}")
	public void eliminarFabricante(@PathVariable(name="codigo")int codigo) {
		fabricanteServiceImpl.eliminarFabricante(codigo);
	}
}
