/**
 * 
 */
package com.pruebafuncional.modeloscanonicos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * @author Personal
 *
 */
public class UsuarioInternoType extends UsuarioType {
	
	public String area;
	
	public String horarioEmpleado;
	
	@NotNull
	@Email(message="no es una direccion de correo valida")
	public String email;

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the horarioEmpleado
	 */
	public String getHorarioEmpleado() {
		return horarioEmpleado;
	}

	/**
	 * @param horarioEmpleado the horarioEmpleado to set
	 */
	public void setHorarioEmpleado(String horarioEmpleado) {
		this.horarioEmpleado = horarioEmpleado;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
