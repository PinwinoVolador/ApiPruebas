package com.utp.proyectoAcreditacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.NormaIso;

@Repository
public interface NormaIsoRepository extends JpaRepository<NormaIso,Integer>{

}
