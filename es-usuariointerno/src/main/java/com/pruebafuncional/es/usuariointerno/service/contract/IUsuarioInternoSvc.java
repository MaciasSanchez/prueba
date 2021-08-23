/**
 * 
 */
package com.pruebafuncional.es.usuariointerno.service.contract;

import com.pruebafuncional.es.usuariointerno.repository.model.UsuarioInterno;
import com.pruebafuncional.es.usuariointerno.utils.exceptions.BusinessException;
import com.pruebafuncional.modeloscanonicos.UsuarioInternoType;

/**
 * @author Personal
 *
 */

public interface IUsuarioInternoSvc {
	
	public UsuarioInterno crearUsuario (UsuarioInterno usuarioInternoType) throws BusinessException;

}
