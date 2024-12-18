package com.utp.proyectoAcreditacion.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.proyectoAcreditacion.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

	List<Usuario> findByTipoUsuarioCodigoTipoUsuario (Integer codigoTipoUsuario);
	
}
