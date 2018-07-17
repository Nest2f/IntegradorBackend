package com.proyecto.service;

import java.util.List;

import com.proyecto.model.Rol;

public interface IRolService {
	Rol insertar(Rol item);

	Rol actualizar(Rol item);

	void eliminar(Long idItem);

	Rol listarId(Long idItem);

	List<Rol> listar();
}
