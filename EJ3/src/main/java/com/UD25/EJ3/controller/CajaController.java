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

import com.UD25.EJ3.dto.Caja;
import com.UD25.EJ3.service.CajaServiceImpl;

@RestController
@RequestMapping("/ud25")
public class CajaController {
	
	@Autowired
	CajaServiceImpl cajaService;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas(){
		return cajaService.listarCajas();
	}
	
	@PostMapping("/caja")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaService.guardarCaja(caja);
	}
	
	@GetMapping("/caja/{numref}")
	public Caja cajaXID(@PathVariable(name = "numref") String numref) {
		return cajaService.cajaXID(numref);
	}
	
	@PutMapping("/caja/{numref}")
	public Caja actualizarCaja(@PathVariable(name = "numref") String numref, @RequestBody Caja caja) {
		
		Caja caja_s = new Caja();
		Caja caja_a = new Caja();
		
		caja_s = cajaService.cajaXID(numref);
		
		
		caja_s.setContenido(caja.getContenido());
		caja_s.setValor(caja.getValor());
		caja_s.setAlmacen(caja.getAlmacen());
		
		caja_a = cajaService.actualizarCaja(caja_s);
		
		System.out.println("La Caja actualizada es: "+caja_a);
		
		return caja_a;
		
	}
	
	@DeleteMapping("/caja/{numref}")
	public void borrarCaja(@PathVariable(name = "numref") String numref) {
		cajaService.eliminarCaja(numref);
		
	}
}
