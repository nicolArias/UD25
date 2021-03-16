package com.UD25.EJ3.service;

import java.util.List;

import com.UD25.EJ3.dto.Sala;


public interface ISalaService {
	
	public List<Sala> listarSalas();

	public Sala guardarSala(Sala sala);

	public Sala salaXID(int id);

	public Sala actualizarSala(Sala sala);

	public void borrarSala(int id);
}
