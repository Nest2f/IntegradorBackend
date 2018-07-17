package com.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa")
	private Long idEmpresa;
	@Column(name = "nombreempresa", nullable = true, length = 100)
	private String nombreempresa;
	@Column(name = "ruc", nullable = true, length = 30)
	private String ruc;
	@Column(name = "telefono", nullable = true, length = 20)
	private String telefono;
	@Column(name = "direccion", nullable = true, length = 100)
	private String direccion;
	@JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
	@ManyToOne
	private Categoria categoria;
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	@ManyToOne
	private Usuario usuario;

	public Empresa() {
		super();
	}

	public Empresa(Long idEmpresa, String nombreempresa, String ruc, String telefono, String direccion,
			Categoria categoria, Usuario usuario) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombreempresa = nombreempresa;
		this.ruc = ruc;
		this.telefono = telefono;
		this.direccion = direccion;
		this.categoria = categoria;
		this.usuario = usuario;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombreempresa() {
		return nombreempresa;
	}

	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", nombreempresa=" + nombreempresa + ", ruc=" + ruc + ", telefono="
				+ telefono + ", direccion=" + direccion + ", categoria=" + categoria + ", usuario=" + usuario;
	}

}
