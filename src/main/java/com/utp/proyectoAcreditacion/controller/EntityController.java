package com.utp.proyectoAcreditacion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.proyectoAcreditacion.entities.Entidad;
import com.utp.proyectoAcreditacion.services.EntidadService;

@RestController
@RequestMapping("api/entidades")
public class EntityController {
	
	@Autowired
	EntidadService entidadsService;
	
	@GetMapping
	public List<Entidad> listarEntidads() {
		return entidadsService.getEntidades();
	}
	
	@GetMapping("/{id}")
	public Optional<Entidad> buscarPorId(@PathVariable Integer id) {
		return entidadsService.findEntidadById(id);
	}
	
	@PostMapping("create")
	public Entidad crear(@RequestBody Entidad Entidad) {
		return entidadsService.createEntidad(Entidad);
	}
	
	@PostMapping("update/{id}")
	public Entidad actualizar(@RequestBody Entidad entidad, @PathVariable Integer id) {
		entidad.setCodigoEntidad(id);
		return entidadsService.updateEntidad(entidad);
	}
	
	@DeleteMapping("delete/{id}")
	public void eliminar(@PathVariable Integer id) {
		entidadsService.deleteEntidad(id);
	}
	
}