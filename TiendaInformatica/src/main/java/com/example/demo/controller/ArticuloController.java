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

import com.example.demo.dto.Articulo;
import com.example.demo.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/tiendaInformatica")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulo salvarArticulo(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulo articuloXCOD(@PathVariable(name="codigo") int codigo) {
		
		Articulo articulo_xcod=new Articulo();
		
		articulo_xcod=articuloServiceImpl.articuloXCOD(codigo);
		
		return articulo_xcod;
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulo actualizarArticulo(@PathVariable(name="codigo")int codigo,@RequestBody Articulo articulo) {
		
		Articulo articulo_seleccionado= new Articulo();
		Articulo articulo_actualizado= new Articulo();
		
		articulo_seleccionado= articuloServiceImpl.articuloXCOD(codigo);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante_fk(articulo.getFabricante_fk());
		
		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArticulo(@PathVariable(name="codigo")int codigo) {
		articuloServiceImpl.eliminarArticulo(codigo);
	}
}
