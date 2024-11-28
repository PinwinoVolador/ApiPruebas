package com.utp.proyectoAcreditacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.proyectoAcreditacion.entities.MicroAuditoria;
import com.utp.proyectoAcreditacion.repositories.MicroAuditoriaRepository;

@Service
public class MicroAuditoriaService {

	@Autowired
	private MicroAuditoriaRepository microAuditoriaRepository;
	
	public List<MicroAuditoria> getMicroAuditorias() {
		return microAuditoriaRepository.findAll();
	}
	
	public MicroAuditoria createMicroAuditoria(MicroAuditoria microAuditoria) {
		return microAuditoriaRepository.save(microAuditoria);
	}
	
	public MicroAuditoria updateMicroAuditoria(MicroAuditoria microAuditoria) {
		return microAuditoriaRepository.save(microAuditoria);
	}
	
	public void deleteMicroAuditoria(Integer id) {
		microAuditoriaRepository.deleteById(id);
	}
	
	public Optional<MicroAuditoria> findMicroAuditoriaById(Integer id) {
		return microAuditoriaRepository.findById(id);
	}
	
	public List<MicroAuditoria> findMicroAuditoriaByCodigoAuditoria(Integer id) {
		return microAuditoriaRepository.findByCodigoAuditoria(id);
	}
	
}
