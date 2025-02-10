package com.catface996.ai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Convert API Documentation")
                        .description("API documentation for Convert API project")
                        .version("1.0")
                        .contact(new Contact()
                                .name("catface996")
                                .url("https://github.com/catface996")));
    }
}