package com.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.IUsuarioDAO;
import com.proyecto.model.Usuario;
import com.proyecto.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	@Autowired
	private IUsuarioDAO dao;

	@Override
	public Usuario insertar(Usuario item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public Usuario actualizar(Usuario item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public void eliminar(Long idItem) {
		// TODO Auto-generated method stub
		dao.deleteById(idItem);
	}

	@Override
	public Usuario listarId(Long idItem) {
		// TODO Auto-generated method stub
		return dao.findById(idItem).get();
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return dao.findAllByOrderByIdUsuarioDesc();
	}

}
