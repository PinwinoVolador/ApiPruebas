package com.utp.proyectoAcreditacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.proyectoAcreditacion.entities.Documento;
import com.utp.proyectoAcreditacion.repositories.DocumentoRepository;

@Service
public class DocumentoService {
	
	@Autowired
	private DocumentoRepository documentoRepository;
	
	public List<Documento> getDocumentos() {
		return documentoRepository.findAll();
	}
	
	public Documento createDocumento(Documento documento) {
		return documentoRepository.save(documento);
	}
	
	public Documento updateDocumento(Documento documento) {
		return documentoRepository.save(documento);
	}
	
	public void deleteDocumento(Integer id) {
		documentoRepository.deleteById(id);
	}
	
	public Optional<Documento> findDocumentoById(Integer id) {
		return documentoRepository.findById(id);
	}

	public List<Documento> findByCodigoSubItem(Integer id) {
		return documentoRepository.findByCodigoSubItem(id);
	}
}
