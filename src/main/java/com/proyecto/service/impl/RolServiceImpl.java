package com.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.dao.IRolDAO;
import com.proyecto.model.Rol;
import com.proyecto.service.IRolService;

public class RolServiceImpl implements IRolService {
	@Autowired
	private IRolDAO dao;

	@Override
	public Rol insertar(Rol item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public Rol actualizar(Rol item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public void eliminar(Long idItem) {
		// TODO Auto-generated method stub
		dao.deleteById(idItem);
	}

	@Override
	public Rol listarId(Long idItem) {
		// TODO Auto-generated method stub
		return dao.findById(idItem).get();
	}

	@Override
	public List<Rol> listar() {
		// TODO Auto-generated method stub
		return dao.findAllByOrderByIdRol();
	}

}
