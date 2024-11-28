package com.utp.proyectoAcreditacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.proyectoAcreditacion.entities.EstadoAuditoria;
import com.utp.proyectoAcreditacion.repositories.EstadoAuditoriaRepository;

@Service
public class EstadoAuditoriaService {

	@Autowired
	private EstadoAuditoriaRepository estadoauditoriaRepository;
	
	public List<EstadoAuditoria> getEstadoAuditorias() {
		return estadoauditoriaRepository.findAll();
	}
	
	public EstadoAuditoria createEstadoAuditoria(EstadoAuditoria estadoAuditoria) {
		return estadoauditoriaRepository.save(estadoAuditoria);
	}
	
	public EstadoAuditoria updateEstadoAuditoria(EstadoAuditoria estadoAuditoria) {
		return estadoauditoriaRepository.save(estadoAuditoria);
	}
	
	public void deleteEstadoAuditoria(Integer id) {
		estadoauditoriaRepository.deleteById(id);
	}
	
	public Optional<EstadoAuditoria> findEstadoAuditoriaById(Integer id) {
		return estadoauditoriaRepository.findById(id);
	}
}
