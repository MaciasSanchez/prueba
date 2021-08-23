/**
 * 
 */
package com.pruebafuncional.modeloscanonicos;

import javax.validation.constraints.NotNull;

/**
 * @author Personal
 *
 */
public class UsuarioType {
	
	@NotNull
	private String nickUsuario;
	@NotNull
	private String contrase�a;
	
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
	 * @return the contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	/**
	 * @param contrase�a the contrase�a to set
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
