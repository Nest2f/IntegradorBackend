package com.proyecto.service;

import java.util.List;

import com.proyecto.model.Usuario;

public interface IUsuarioService {
	Usuario insertar(Usuario item);

	Usuario actualizar(Usuario item);

	void eliminar(Long idItem);

	Usuario listarId(Long idItem);

	List<Usuario> listar();

}
