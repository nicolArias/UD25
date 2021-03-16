package com.UD25.EJ3.service;

import java.util.List;

import com.UD25.EJ3.dto.Caja;

public interface ICajaService {
	
	public List<Caja> listarCajas();
	
	public Caja guardarCaja(Caja caja);
	
	public Caja cajaXID(String numref);
	
	public Caja actualizarCaja(Caja caja);
	
	public void eliminarCaja(String numref);
}
