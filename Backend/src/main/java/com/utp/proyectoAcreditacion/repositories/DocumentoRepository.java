package com.utp.proyectoAcreditacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Integer>{
	
	List<Documento> findByCodigoSubItem(Integer codigo_item);
	
}
