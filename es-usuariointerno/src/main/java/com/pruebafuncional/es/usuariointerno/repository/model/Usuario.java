/**
 * 
 */
package com.pruebafuncional.es.usuariointerno.repository.model;

import javax.validation.constraints.NotNull;

import com.pruebafuncional.modeloscanonicos.TipoUsuarioEnum;

/**
 * @author Personal
 *
 */

public class Usuario {
	
	@NotNull
	private String nickUsuario;
	@NotNull
	private String contraseña;
	
	private TipoUsuarioEnum tipoUsuario;

	/**
	 * @return the nickUsuario
	 */
	public String getNickUsuario() {
		return nickUsuario;
	}

	/**
	 * @param nickUsuario the nickUsuario to set
	 */
	public void setNickUsuario(String nickUsuario) {
		this.nickUsuario = nickUsuario;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	/**
	 * @return the tipoUsuario
	 */
	public TipoUsuarioEnum getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	
	
}
