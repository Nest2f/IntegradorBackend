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
@Table(name = "noticias")
public class Noticias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_noticia")
	private Long idNoticia;
	@Column(name = "encabezado")
	private String encabezado;
	@Column(name = "imagen")
	private String imagen;
	@Column(name = "nombreproducto")
	private String nombreProducto;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "descuentos")
	private String descuentos;
	@Column(name = "ofertas")
	private String ofertas;
	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresa empresa;

	public Noticias() {
		super();
	}

	public Noticias(Long idNoticia, String encabezado, String imagen, String nombreProducto, String descripcion,
			String descuentos, String ofertas, Empresa empresa) {
		super();
		this.idNoticia = idNoticia;
		this.encabezado = encabezado;
		this.imagen = imagen;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.descuentos = descuentos;
		this.ofertas = ofertas;
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescuentos() {
		return descuentos;
	}

	public void setDescuentos(String descuentos) {
		this.descuentos = descuentos;
	}

	public String getOfertas() {
		return ofertas;
	}

	public void setOfertas(String ofertas) {
		this.ofertas = ofertas;
	}

	public Long getIdNoticia() {
		return idNoticia;
	}

	public void setIdNoticia(Long idNoticia) {
		this.idNoticia = idNoticia;
	}

	public String getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Noticias [idNoticia=" + idNoticia + ", encabezado=" + encabezado + ", imagen=" + imagen
				+ ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", descuentos=" + descuentos
				+ ", ofertas=" + ofertas + ", empresa=" + empresa + "]";
	}

}
