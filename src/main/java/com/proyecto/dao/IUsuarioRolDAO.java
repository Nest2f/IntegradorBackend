package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.model.UsuarioRol;

@Repository
public interface IUsuarioRolDAO extends JpaRepository<UsuarioRol, Long> {
	List<UsuarioRol> findAllByOrderByIdUsuarioRolDesc();
}
