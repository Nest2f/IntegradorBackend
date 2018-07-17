package com.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long idUsuario;
	@Column(name = "cedulausuario", length = 20, nullable = false)
	private String username;
	@Column(name = "clave", nullable = true, length = 100)
	private String password;
	@Column(name = "activo", nullable = true)
	private Boolean enabled;
	@Column(name = "email", nullable = true, length = 60)
	private String email;
	@Column(name = "telefono", nullable = true, length = 60)
	private String telefono;

	public Usuario() {
		super();
	}

	public Usuario(Long idUsuario, String username, String password, Boolean enabled, String email, String telefono) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.email = email;
		this.telefono = telefono;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", username=" + username + ", password=" + password + ", enabled="
				+ enabled + ", email=" + email + ", telefono=" + telefono + "]";
	}

}
