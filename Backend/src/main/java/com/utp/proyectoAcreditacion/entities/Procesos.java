package com.utp.proyectoAcreditacion.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "procesos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Procesos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_proceso")
	private int codigoProceso;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "codigo_entidad")
	private int codigoEntidad;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "comentario")
	private String comentario;
}
