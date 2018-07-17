package com.proyecto.service;

import java.util.List;

import com.proyecto.model.UsuarioRol;

public interface IUsuarioRolService {
	UsuarioRol insertar(UsuarioRol item);

	UsuarioRol actualizar(UsuarioRol item);

	void eliminar(Long idItem);

	UsuarioRol listarId(Long idItem);

	List<UsuarioRol> listar();
}
