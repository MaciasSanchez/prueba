/**
 * 
 */
package com.pruebafuncional.es.usuariointerno.utils;

import org.modelmapper.ModelMapper;

import com.pruebafuncional.es.usuariointerno.repository.model.UsuarioInterno;
import com.pruebafuncional.modeloscanonicos.UsuarioInternoType;

/**
 * @author Personal
 *
 */
public class UsuarioConvert {
	
	private UsuarioConvert() {
		
	}
	
	
	public static final UsuarioInternoType modelToType(UsuarioInterno usuario) {
		return new ModelMapper().map(usuario, UsuarioInternoType.class);
	}
	
	public static final UsuarioInterno typeToModel(UsuarioInternoType usuarioType) {
		return new ModelMapper().map(usuarioType, UsuarioInterno.class);
	}

}
