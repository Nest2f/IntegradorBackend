package com.proyecto.service;

import java.util.List;

import com.proyecto.model.Categoria;

public interface ICategoriaService {
	Categoria insertar(Categoria item);

	Categoria actualizar(Categoria item);

	void eliminar(Long idItem);

	Categoria listarId(Long idItem);

	List<Categoria> listar();
}
