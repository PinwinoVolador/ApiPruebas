package com.utp.proyectoAcreditacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.proyectoAcreditacion.entities.Interrogantes;
import com.utp.proyectoAcreditacion.repositories.InterrogantesRepository;

@Service
public class InterrogantesService {
	
	@Autowired
	private InterrogantesRepository interrogantesRepository;
	
	public List<Interrogantes> getInterrogantes() {
		return interrogantesRepository.findAll();
	}
	
	public Interrogantes createInterrogante(Interrogantes interrogantes) {
		return interrogantesRepository.save(interrogantes);
	}
	
	public Interrogantes updateInterrogante(Interrogantes interrogantes) {
		return interrogantesRepository.save(interrogantes);
	}
	
	public void deleteInterrogante(Integer id) {
		interrogantesRepository.deleteById(id);
	}
	
	public Optional<Interrogantes> findInterroganteById(Integer id) {
		return interrogantesRepository.findById(id);
	}
	
	public List<Interrogantes> findInterroganteByMicroAuditoria(Integer id) {
		return getInterrogantes().stream().filter(i -> i.getCodigoMicroAuditoria()==id).toList();
	}
	
}
