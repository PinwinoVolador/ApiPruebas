package com.utp.proyectoAcreditacion.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.SubItem;

@Repository
public interface SubItemRepository extends JpaRepository<SubItem,Integer>{
	
}
