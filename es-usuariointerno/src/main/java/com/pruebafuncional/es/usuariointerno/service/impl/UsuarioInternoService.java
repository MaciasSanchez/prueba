/**
 * 
 */
package com.pruebafuncional.es.usuariointerno.service.impl;

import org.springframework.stereotype.Service;

import com.pruebafuncional.es.usuariointerno.repository.contract.IUsuarioInternoRepository;
import com.pruebafuncional.es.usuariointerno.repository.model.UsuarioInterno;
import com.pruebafuncional.es.usuariointerno.service.contract.IUsuarioInternoSvc;

/**
 * @author Personal
 *
 */
@Service
public class UsuarioInternoService implements IUsuarioInternoSvc {
	
	
	IUsuarioInternoRepository usuarioRepository;

	@Override
	public UsuarioInterno crearUsuario(UsuarioInterno usuarioInternoType) {
	return usuarioRepository.save(usuarioInternoType);
	}

}
