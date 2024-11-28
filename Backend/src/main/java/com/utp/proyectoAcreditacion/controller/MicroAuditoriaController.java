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

import com.utp.proyectoAcreditacion.entities.MicroAuditoria;
import com.utp.proyectoAcreditacion.services.MicroAuditoriaService;


@RestController
@RequestMapping("api/microAuditoria")
public class MicroAuditoriaController {

	@Autowired
	private MicroAuditoriaService microAuditoriaService;
	
	@GetMapping
	public List<MicroAuditoria> listarItems() {
		return microAuditoriaService.getMicroAuditorias();
	}
	
	@GetMapping("/{id}")
	public Optional<MicroAuditoria> buscarPorId(@PathVariable Integer id) {
		return microAuditoriaService.findMicroAuditoriaById(id);
	}
	
	@PostMapping("create")
	public MicroAuditoria crear(@RequestBody MicroAuditoria microAuditoria) {
		return microAuditoriaService.createMicroAuditoria(microAuditoria);
	}
	
	@PostMapping("update/{id}")
	public MicroAuditoria actualizar(@RequestBody MicroAuditoria microAuditoria, @PathVariable Integer id) {
		microAuditoria.setCodigoMicroAuditoria(id);
		return microAuditoriaService.updateMicroAuditoria(microAuditoria);
	}
	
	@DeleteMapping("delete/{id}")
	public void eliminar(@PathVariable Integer id) {
		microAuditoriaService.deleteMicroAuditoria(id);
	}
	
	@GetMapping("/auditoria/{id}")
	public List<MicroAuditoria> getMethodName(@PathVariable Integer id) {
		return microAuditoriaService.findMicroAuditoriaByCodigoAuditoria(id);
	}
	
}
