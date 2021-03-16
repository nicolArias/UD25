package com.UD25.EJ3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25.EJ3.dao.IAlmacenDAO;
import com.UD25.EJ3.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService  {
	
	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacen> listarAlmacenes() {
		
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(int id) {
		
		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int id) {
		iAlmacenDAO.deleteById(id);
		
	}
	
	
}
