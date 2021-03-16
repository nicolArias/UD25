package com.UD25.EJ3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UD25.EJ3.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Integer> {
	
}
