package com.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.ICategoriaDAO;
import com.proyecto.model.Categoria;
import com.proyecto.service.ICategoriaService;

@Service
public class CategoriaServiceImpl implements ICategoriaService {
	@Autowired
	private ICategoriaDAO dao;

	@Override
	public Categoria insertar(Categoria item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public Categoria actualizar(Categoria item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public void eliminar(Long idItem) {
		// TODO Auto-generated method stub
		dao.deleteById(idItem);
	}

	@Override
	public Categoria listarId(Long idItem) {
		// TODO Auto-generated method stub
		return dao.findById(idItem).get();
	}

	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return dao.findAllByOrderByIdCategoriaDesc();
	}

}
