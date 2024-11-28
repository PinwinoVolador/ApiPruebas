package com.utp.proyectoAcreditacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.Imagen;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Integer>{
	
	List<Imagen> findByCodigoNormaIso(Integer name);
	
}
