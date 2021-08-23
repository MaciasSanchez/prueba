/**
 * 
 */
package com.pruebafuncional.es.usuariointerno.utils.exceptions;

/**
 * @author Personal
 *
 */
public enum TipoError {
	
	NO_ENCONTRADO("404"), SOLICITUD_INVALIDA("400"), CREDENCIALES_INCORRECTAS("401"), EQUIPO_REGISTRADO_NO_DISPONIBLE("403"), SERVICIO_INACCESIBLE("502"),
	FUENTE_DE_DATOS("503"), ERROR_INESPERADO("500"), LOGICA_NEGOCIO("0004");
	
	
	 
	
	
	private String value;
	
	private TipoError(String value) {
		this.value = value;
	}

	/**
	 * 
	 * @return
	 */
	public String getValue() {
		return value;
	}
}
