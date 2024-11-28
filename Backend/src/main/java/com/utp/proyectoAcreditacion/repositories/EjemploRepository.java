package com.utp.proyectoAcreditacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.Ejemplo;

@Repository
public interface EjemploRepository extends JpaRepository<Ejemplo,Integer>{
	
	List<Ejemplo> findByCodigoSubItem(Integer codigo_item);
	
}
