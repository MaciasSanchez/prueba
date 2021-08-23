package com.pruebafuncional.es.usuariointerno.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * 
 * @author Personal
 *
 */
@Configuration
@OpenAPIDefinition
public class OpenAPIDocumentationConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
            .title("API REST UsuarioInternoES")
            .description("Servicio Entidad Usuario Interno")
            .version("1.0").termsOfService("http://www.termsOfService.com")
            .contact(new Contact().name("").email("angelica.macias.sa91@gmail.com").url(""))
            .license(new License().name("Apache 2.0").url("https://www.gnu.org/licenses/gpl-3.0.html")));
    }


}
