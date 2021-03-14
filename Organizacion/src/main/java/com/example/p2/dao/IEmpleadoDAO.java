package com.example.p2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.p2.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String> {

}
