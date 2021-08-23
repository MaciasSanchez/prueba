/**
 * 
 */
package com.pruebafuncional.es.usuariointerno.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.pruebafuncional.es.usuariointerno.controller.type.RespuestaType;
import com.pruebafuncional.es.usuariointerno.repository.model.UsuarioInterno;
import com.pruebafuncional.es.usuariointerno.utils.exceptions.BusinessException;

/**
 * @author Personal
 *
 */
public class UsuarioValidator {
	
	public static ResponseEntity<RespuestaType> validarResultadoaByCreate(UsuarioInterno resultado) {
		if (resultado == null) {
			return new ResponseEntity<>(
					new RespuestaType().codigoRespuesta("500").descripcion("El recurso no pudo ser creado"),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<>(
				new RespuestaType().codigoRespuesta("201")
						.descripcion(String.format("ID del recurso creado: [%s]", resultado.getNickUsuario())),
				HttpStatus.CREATED);
	}
	
	
	private UsuarioValidator() {
		
	}
	
	
	public static ResponseEntity<RespuestaType> validarResultado(BusinessException ex) {
		ResponseEntity<RespuestaType> respuesta;
		switch (ex.getError()) {
		case NO_ENCONTRADO:
			respuesta = new ResponseEntity<>(new RespuestaType().codigoRespuesta("404").descripcion(ex.getMessage()),
					HttpStatus.NOT_FOUND);
			break;
		case SOLICITUD_INVALIDA:
			respuesta = new ResponseEntity<>(new RespuestaType().codigoRespuesta("400").descripcion(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
			break;
		case SERVICIO_INACCESIBLE:
			respuesta = new ResponseEntity<>(new RespuestaType().codigoRespuesta("502").descripcion(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		case FUENTE_DE_DATOS:
			respuesta = new ResponseEntity<>(new RespuestaType().codigoRespuesta("503").descripcion(ex.getMessage()),
					HttpStatus.SERVICE_UNAVAILABLE);
			break;
		case LOGICA_NEGOCIO:
			respuesta = new ResponseEntity<>(new RespuestaType().codigoRespuesta("0004").descripcion(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
			break;
		case CREDENCIALES_INCORRECTAS:
			respuesta = new ResponseEntity<>(new RespuestaType().codigoRespuesta("401").descripcion(ex.getMessage()),
					HttpStatus.UNAUTHORIZED);
			break;
		case EQUIPO_REGISTRADO_NO_DISPONIBLE:
			respuesta = new ResponseEntity<>(new RespuestaType().codigoRespuesta("403").descripcion(ex.getMessage()),
					HttpStatus.FORBIDDEN);
			break;
		default:
			respuesta = new ResponseEntity<>(new RespuestaType().codigoRespuesta("500").descripcion(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		}

		return respuesta;
	}

}
