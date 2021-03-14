package com.example.p2.controller;

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

import com.example.p2.dto.Empleado;
import com.example.p2.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/organizacion")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{dni}")
	public Empleado empleadoXDNI(@PathVariable(name="dni") String dni) {
		
		Empleado empleado_xdni= new Empleado();
		
		empleado_xdni=empleadoServiceImpl.empleadoXDNI(dni);
		
		System.out.println("Empleado XDNI: "+empleado_xdni);
		
		return empleado_xdni;
	}
	
	@PutMapping("empleados/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name="dni")String dni,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= empleadoServiceImpl.empleadoXDNI(dni);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento_fk(empleado.getDepartamento_fk());
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleado/{dni}")
	public void eliminarEmpleado(@PathVariable(name="dni")String dni) {
		empleadoServiceImpl.eliminarEmpleado(dni);
	}
}
