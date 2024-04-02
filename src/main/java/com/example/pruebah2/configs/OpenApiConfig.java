package com.example.pruebah2.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @io.swagger.v3.oas.annotations.info.Info(
                title = "User API",
                version = "1.0",
                description = "Documentation for User API"
        )
)
public class OpenApiConfig {
}
