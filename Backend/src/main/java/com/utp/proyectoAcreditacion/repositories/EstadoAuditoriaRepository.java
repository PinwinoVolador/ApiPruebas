package com.utp.proyectoAcreditacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.EstadoAuditoria;

@Repository
public interface EstadoAuditoriaRepository extends JpaRepository<EstadoAuditoria, Integer>{

}
