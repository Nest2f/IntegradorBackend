package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.model.Usuario;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {
	List<Usuario> findAllByOrderByIdUsuarioDesc();
}
