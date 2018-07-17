package com.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.dao.IEmpresaDAO;
import com.proyecto.model.Empresa;
import com.proyecto.service.IEmpresaService;

public class EmpresaServiceImpl implements IEmpresaService {
	@Autowired
	private IEmpresaDAO dao;

	@Override
	public Empresa insertar(Empresa item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public Empresa actualizar(Empresa item) {
		// TODO Auto-generated method stub
		return dao.save(item);
	}

	@Override
	public void eliminar(Long idItem) {
		// TODO Auto-generated method stub
		dao.deleteById(idItem);
	}

	@Override
	public Empresa listarId(Long idItem) {
		// TODO Auto-generated method stub
		return dao.findById(idItem).get();
	}

	@Override
	public List<Empresa> listar() {
		// TODO Auto-generated method stub
		return dao.findAllByOrderByIdEmpresaDesc();
	}

}
