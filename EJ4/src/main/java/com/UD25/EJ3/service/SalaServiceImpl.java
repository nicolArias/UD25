package com.UD25.EJ3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25.EJ3.dao.ISalaDAO;
import com.UD25.EJ3.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	ISalaDAO salaDAO;
	
	@Override
	public List<Sala> listarSalas() {
		
		return salaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		
		return salaDAO.save(sala);
	}

	@Override
	public Sala salaXID(int id) {
		
		return salaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		
		return salaDAO.save(sala);
	}

	@Override
	public void borrarSala(int id) {
		salaDAO.deleteById(id);
		
	}

}
