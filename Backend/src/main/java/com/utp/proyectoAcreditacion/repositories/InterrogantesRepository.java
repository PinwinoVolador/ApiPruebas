package com.utp.proyectoAcreditacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.Interrogantes;

@Repository
public interface InterrogantesRepository extends JpaRepository<Interrogantes, Integer>{

}
