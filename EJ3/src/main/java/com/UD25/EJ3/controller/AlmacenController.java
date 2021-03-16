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

import com.UD25.EJ3.dto.Almacen;
import com.UD25.EJ3.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/ud25")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenService;
	
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return almacenService.listarAlmacenes();
	}
	
	@PostMapping("/almacen")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return almacenService.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacen/{id}")
	public Almacen almacenXID(@PathVariable(name = "id") int id) {
		return almacenService.almacenXID(id);
	}
	
	@PutMapping("/almacen/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name = "id") int id, @RequestBody Almacen almacen) {
		
		Almacen almacen_s = new Almacen();
		Almacen almacen_a = new Almacen();
		
		almacen_s = almacenService.almacenXID(id);
		
		almacen_s.setLugar(almacen.getLugar());
		almacen_s.setCapacidad(almacen.getCapacidad());
		
		almacen_a = almacenService.actualizarAlmacen(almacen_s);
		
		System.out.println("El almacen actualizado es: "+almacen_a);
		
		return almacen_a;
		
	}
	
	@DeleteMapping("/almacen/{id}")
	public void eliminarAlmacen(@PathVariable(name = "id") int id) {
		almacenService.eliminarAlmacen(id);
		
	}
}
