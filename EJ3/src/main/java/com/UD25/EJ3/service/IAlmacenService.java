package com.UD25.EJ3.service;

import java.util.List;

import com.UD25.EJ3.dto.Almacen;

public interface IAlmacenService {
	
	//Metodos CRUD
	public List<Almacen> listarAlmacenes();
	
	public Almacen guardarAlmacen(Almacen almacen);
	
	public Almacen almacenXID(int id);
	
	public Almacen actualizarAlmacen(Almacen almacen);
	
	public void eliminarAlmacen(int id);

}
