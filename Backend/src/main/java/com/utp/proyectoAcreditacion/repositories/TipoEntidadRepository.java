package com.utp.proyectoAcreditacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.TipoEntidad;

@Repository
public interface TipoEntidadRepository extends JpaRepository<TipoEntidad, Integer>{

}
