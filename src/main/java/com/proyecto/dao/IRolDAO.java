package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.model.Rol;

@Repository
public interface IRolDAO extends JpaRepository<Rol, Long> {
	List<Rol> findAllByOrderByIdRol();

}
