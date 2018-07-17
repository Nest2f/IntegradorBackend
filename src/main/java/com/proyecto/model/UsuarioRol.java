package com.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario_rol")
	private Long idUsuarioRol;
	@JsonIgnore()
	@ManyToOne
	@JoinColumn(name = "id_rol", nullable = false)
	private Rol rol;
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;

	public UsuarioRol() {
		super();
	}

	public UsuarioRol(Long idUsuarioRol, Rol rol, Usuario usuario) {
		super();
		this.idUsuarioRol = idUsuarioRol;
		this.rol = rol;
		this.usuario = usuario;
	}

	public Long getIdUsuarioRol() {
		return idUsuarioRol;
	}

	public void setIdUsuarioRol(Long idUsuarioRol) {
		this.idUsuarioRol = idUsuarioRol;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "UsuarioRol [idUsuarioRol=" + idUsuarioRol + ", rol=" + rol + ", usuario=" + usuario + "]";
	}

}
