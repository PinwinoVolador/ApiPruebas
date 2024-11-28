package com.utp.proyectoAcreditacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.SolicitudAuditoria;

@Repository
public interface SolicitudAuditoriaRepository extends JpaRepository<SolicitudAuditoria, Integer>{

}
