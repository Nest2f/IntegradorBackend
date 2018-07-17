package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.model.Empresa;

@Repository
public interface IEmpresaDAO extends JpaRepository<Empresa, Long> {
	List<Empresa> findAllByOrderByIdEmpresaDesc();
}
