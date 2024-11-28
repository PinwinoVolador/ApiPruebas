package com.utp.proyectoAcreditacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.Auditoria;

@Repository
public interface AuditoriaRepository extends JpaRepository<Auditoria, Integer>{

}
