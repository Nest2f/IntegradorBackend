package com.proyecto.service;

import java.util.List;

import com.proyecto.model.Empresa;

public interface IEmpresaService {
	Empresa insertar(Empresa item);

	Empresa actualizar(Empresa item);

	void eliminar(Long idItem);

	Empresa listarId(Long idItem);

	List<Empresa> listar();
}
