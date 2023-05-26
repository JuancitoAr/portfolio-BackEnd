package com.portfolio.ap;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApApplication.class, args);
	}
        
        @Bean
        public OpenAPI customOpenAPI(){
            return new OpenAPI()
                    .info(new Info()
                            .title("Back-end Portfolio de Juan Arredondo - #YoProgramo 4ta edición")
                            .version("0.2")
                            .description("Implementación de Swagger UI para mejorar la documentación de la API.")
                            .termsOfService(""));
        }

}
