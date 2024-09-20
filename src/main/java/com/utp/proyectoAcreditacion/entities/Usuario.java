package com.utp.proyectoAcreditacion.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	@Id
	@Column(name = "codigo_usuario")
	private Integer codigoUsuario;
	
	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	
	@Column(name = "apellido_pat")
	private String apellidoPat;
	
	@Column(name = "apellido_mat")
	private String apellidoMat;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "correo_electronico")
	private String correoElectronico;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "codigo_tipo_usuario")
	private Integer codigoTipoUsuario;
	
	/*
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "codigo_tipo_usuario", nullable = false)
	private TipoUsuario tipoUsuario;
	*/
}
