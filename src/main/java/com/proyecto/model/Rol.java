package com.proyecto.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol")
	private Long idRol;
	@Column(name = "nombrerol", nullable = true, length = 100)
	private String nombrerol;
	@Column(name = "descripcion", nullable = true, length = 100)
	private String descripcion;
	@OneToMany(mappedBy = "rol", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<UsuarioRol> usuarioRol;

	public Rol() {
		super();
	}

	public Rol(Long idRol, String nombrerol, String descripcion, List<UsuarioRol> usuarioRol) {
		super();
		this.idRol = idRol;
		this.nombrerol = nombrerol;
		this.descripcion = descripcion;
		this.usuarioRol = usuarioRol;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getNombrerol() {
		return nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<UsuarioRol> getUsuarioRol() {
		return usuarioRol;
	}

	public void setUsuarioRol(List<UsuarioRol> usuarioRol) {
		this.usuarioRol = usuarioRol;
	}

	@Override
	public String toString() {
		return "Rol [idRol=" + idRol + ", nombrerol=" + nombrerol + ", descripcion=" + descripcion + ", usuarioRol="
				+ usuarioRol + "]";
	}

}
