/**
 * 
 */
package com.pruebafuncional.es.usuariointerno.controller.contract;


import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pruebafuncional.es.usuariointerno.controller.type.RespuestaType;
import com.pruebafuncional.es.usuariointerno.repository.model.UsuarioInterno;
import com.pruebafuncional.modeloscanonicos.UsuarioInternoType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Personal
 *
 */
@Validated
@Tag(name = "UsuarioInternoESv1", description = "Servicio Entidad Usuario Interno")
public interface IUsuarioInternoController {
	
	/**
     * POST /usuarioInterno/v1 : Crear Usuario Interno
     * Crear un nuevo usuario interno
     *
     * @param usuarioInternoType  (optional)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     */
    @Operation(method = "Crear Usuario", operationId = "crearUsuario", description = "Crear un nuevo usuario", tags={ "UsuarioInternoESv1", }, summary = "crearUsuario")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description =  "OK", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
        @ApiResponse(responseCode = "400", description =  "Bad Request", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
        @ApiResponse(responseCode = "500", description =  "Internal Server Error", content = @Content(schema = @Schema(implementation = RespuestaType.class))) })
    @PostMapping(value = "/usuarioInterno/v1",
        produces = "application/json", 
        consumes = "application/json")
    @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Usuario",required = true,content = @Content(schema = @Schema(implementation = UsuarioInterno.class)))
    ResponseEntity<?> crearUsuario( @Valid @RequestBody(required = false) UsuarioInterno usuarioType);
    

}
