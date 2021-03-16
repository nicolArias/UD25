package com.UD25.EJ3.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25.EJ3.dao.ICajaDAO;
import com.UD25.EJ3.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService {

	@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Caja> listarCajas() {
		
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(String numref) {
		
		return iCajaDAO.findById(numref).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String numref) {
		iCajaDAO.deleteById(numref);
		
	}
}
