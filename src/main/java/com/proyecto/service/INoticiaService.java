package com.proyecto.service;

import java.util.List;

import com.proyecto.model.Empresa;
import com.proyecto.model.Noticias;

public interface INoticiaService {
	Noticias insertar(Noticias item);

	Noticias actualizar(Noticias item);

	void eliminar(Long idItem);

	Noticias listarId(Long idItem);

	List<Noticias> listar();

	List<Noticias> listarByEmpresa(Empresa item);

}
