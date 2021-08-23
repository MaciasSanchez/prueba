package com.pruebafuncional.es.usuariointerno.repository.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "usuarios")
public class UsuarioInterno  extends Usuario{
	
	@Id
	public String id;
	
	public String area;
	
	public String horarioEmpleado;
	
	@NotNull
	@Email(message="no es una direccion de correo valida")
	public String email;

	/**
	 * @param id
	 * @param area
	 * @param horarioEmpleado
	 * @param email
	 */
	public UsuarioInterno(String id, String area, String horarioEmpleado,
			@NotNull @Email(message = "no es una direccion de correo valida") String email) {
		this.id = id;
		this.area = area;
		this.horarioEmpleado = horarioEmpleado;
		this.email = email;
	}

	
	
}
