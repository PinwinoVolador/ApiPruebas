package com.utp.proyectoAcreditacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer>{
	
	List<Item> findByCodigoNormaIso (Integer codigoNorma);
	
}
