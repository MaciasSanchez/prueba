/**
 * 
 */
package com.pruebafuncional.es.usuariointerno.controller.impl;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebafuncional.es.usuariointerno.controller.contract.IUsuarioInternoController;
import com.pruebafuncional.es.usuariointerno.repository.model.UsuarioInterno;
import com.pruebafuncional.es.usuariointerno.service.contract.IUsuarioInternoSvc;
import com.pruebafuncional.es.usuariointerno.utils.UsuarioValidator;
import com.pruebafuncional.es.usuariointerno.utils.exceptions.BusinessException;
import com.pruebafuncional.modeloscanonicos.UsuarioInternoType;

/**
 * @author Personal
 *
 */
@RestController
@RequestMapping("/api/es")
public class UsuarioInternoController implements IUsuarioInternoController {
	
private static final Logger LOG = LoggerFactory.getLogger(UsuarioInternoController.class);
	
	@Autowired
	IUsuarioInternoSvc service;

	@Override
	public ResponseEntity<?> crearUsuario(@Valid UsuarioInterno usuarioType) {
		
		LOG.info("INICIA PROCESO DE CREAR USUARIO");
		ResponseEntity<?> respuesta;
		
		try {	
			UsuarioInterno result = service.crearUsuario(usuarioType);
			respuesta = UsuarioValidator.validarResultadoaByCreate(result);

		} catch (BusinessException e) {
			LOG.error("ERROR DE NEGOCIO EN CREAR EMPRESA");
			respuesta = UsuarioValidator.validarResultado(e);
		} catch (Exception e) {
			LOG.error("ERROR PROCESO DE CREAR USUARIO");
			LOG.error(e.getMessage());
			
			respuesta = new ResponseEntity<String>("ALGO MALO OCURIO, LO SOLUCIONAREMOS PRONTO", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		LOG.info("FINALIZA PROCESO DE CREAR USUARIO");
		return respuesta;
	}

}
