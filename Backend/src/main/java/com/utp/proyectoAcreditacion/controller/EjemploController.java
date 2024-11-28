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

import com.utp.proyectoAcreditacion.entities.Ejemplo;
import com.utp.proyectoAcreditacion.services.EjemploService;

@RestController
@RequestMapping("api/ejemplos")
public class EjemploController {
	
	@Autowired
	EjemploService EjemploLinkService;
	
	@GetMapping
	public List<Ejemplo> listarEjemplos() {
		return EjemploLinkService.getEjemplos();
	}
	
	@GetMapping("/{id}")
	public Optional<Ejemplo> buscarPorId(@PathVariable Integer id) {
		return EjemploLinkService.findEjemploById(id);
	}
	
	@PostMapping("create")
	public Ejemplo crear(@RequestBody Ejemplo EjemploLink) {
		return EjemploLinkService.createEjemplo(EjemploLink);
	}
	
	@PostMapping("update/{id}")
	public Ejemplo actualizar(@RequestBody Ejemplo EjemploLink, @PathVariable Integer id) {
		EjemploLink.setCodigoEjemplo(id);
		return EjemploLinkService.updateEjemplo(EjemploLink);
	}
	
	@DeleteMapping("delete/{id}")
	public void eliminar(@PathVariable Integer id) {
		EjemploLinkService.deleteEjemplo(id);
	}
	
}
