/**
 * 
 */
package com.pruebafuncional.es.usuariointerno.repository.contract;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pruebafuncional.es.usuariointerno.repository.model.UsuarioInterno;


/**
 * @author Personal
 *
 */
@Repository
public interface IUsuarioInternoRepository extends MongoRepository<UsuarioInterno, String>{

}
