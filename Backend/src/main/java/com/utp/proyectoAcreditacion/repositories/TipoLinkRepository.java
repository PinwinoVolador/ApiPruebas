package com.utp.proyectoAcreditacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.TipoLink;

@Repository
public interface TipoLinkRepository extends JpaRepository<TipoLink, Integer>{

}
