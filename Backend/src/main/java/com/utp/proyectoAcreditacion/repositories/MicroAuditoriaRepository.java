package com.utp.proyectoAcreditacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.MicroAuditoria;

@Repository
public interface MicroAuditoriaRepository extends JpaRepository<MicroAuditoria, Integer>{
	
	List<MicroAuditoria> findByCodigoAuditoria (Integer codigoAuditoria);
}
