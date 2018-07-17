package com.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.IUsuarioRolDAO;
import com.proyecto.model.UsuarioRol;
import com.proyecto.service.IUsuarioRolService;

@Service
public class UsuarioRolServiceImpl implements IUsuarioRolService {
	@Autowired
	private IUsuarioRolDAO dao;

	@Override
	public UsuarioRol insertar(UsuarioRol item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public UsuarioRol actualizar(UsuarioRol item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public void eliminar(Long idItem) {
		// TODO Auto-generated method stub
		dao.deleteById(idItem);
	}

	@Override
	public UsuarioRol listarId(Long idItem) {
		// TODO Auto-generated method stub
		return dao.findById(idItem).get();
	}

	@Override
	public List<UsuarioRol> listar() {
		// TODO Auto-generated method stub
		return dao.findAllByOrderByIdUsuarioRolDesc();
	}

}
