package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.model.Empresa;
import com.proyecto.model.Noticias;

@Repository
public interface INoticiasDAO extends JpaRepository<Noticias, Long> {
	List<Noticias> findAllByOrderByIdNoticiaDesc();

	List<Noticias> findByEmpresaOrderByIdNoticiaDesc(Empresa item);
}
