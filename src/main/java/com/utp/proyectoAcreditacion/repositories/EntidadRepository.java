package com.utp.proyectoAcreditacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.Entidad;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Integer>{

}
