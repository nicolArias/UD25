package com.example.p2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.p2.dao.IDepartamentoDAO;
import com.example.p2.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXCOD(int codigo) {
		return iDepartamentoDAO.findById(codigo).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(int codigo) {
		iDepartamentoDAO.deleteById(codigo);
	}

}
