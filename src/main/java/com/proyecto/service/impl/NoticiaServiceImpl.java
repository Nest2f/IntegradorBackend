package com.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.INoticiasDAO;
import com.proyecto.model.Empresa;
import com.proyecto.model.Noticias;
import com.proyecto.service.INoticiaService;

@Service
public class NoticiaServiceImpl implements INoticiaService {
	@Autowired
	private INoticiasDAO dao;

	@Override
	public Noticias insertar(Noticias item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public Noticias actualizar(Noticias item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public void eliminar(Long idItem) {
		// TODO Auto-generated method stub
		dao.deleteById(idItem);
	}

	@Override
	public Noticias listarId(Long idItem) {
		// TODO Auto-generated method stub
		return dao.findById(idItem).get();
	}

	@Override
	public List<Noticias> listar() {
		// TODO Auto-generated method stub
		return dao.findAllByOrderByIdNoticiaDesc();
	}

	@Override
	public List<Noticias> listarByEmpresa(Empresa item) {
		// TODO Auto-generated method stub
		return null;
	}

}
