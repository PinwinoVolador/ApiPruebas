package com.utp.proyectoAcreditacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.Procesos;

@Repository
public interface ProcesosRepository extends JpaRepository<Procesos, Integer>{

}