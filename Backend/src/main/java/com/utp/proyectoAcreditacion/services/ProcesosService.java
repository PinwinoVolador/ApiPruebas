package com.utp.proyectoAcreditacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.proyectoAcreditacion.entities.Procesos;
import com.utp.proyectoAcreditacion.repositories.ProcesosRepository;

@Service
public class ProcesosService {
	
	@Autowired
	private ProcesosRepository procesosRepository;
	
	public List<Procesos> getProcesos() {
		return procesosRepository.findAll();
	}
	
	public Procesos createProcesos(Procesos procesos) {
		return procesosRepository.save(procesos);
	}
	
	public Procesos updateProcesos(Procesos procesos) {
		return procesosRepository.save(procesos);
	}
	
	public void deleteProcesos(Integer id) {
		procesosRepository.deleteById(id);
	}
	
	public Optional<Procesos> findProcesosById(Integer id) {
		return procesosRepository.findById(id);
	}
	
	public List<Procesos> findByCodigoEntidad(Integer id) {
		return getProcesos().stream().filter(p -> p.getEntidad().getCodigoEntidad() == id).toList();
	}
	
}
