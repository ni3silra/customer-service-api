package com.ni3.customerserviceapi.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(regex("/customer.*"))
                .apis(RequestHandlerSelectors.basePackage("com.ni3"))
                .build()
                .apiInfo(apiDetails());
    }

    private ApiInfo apiDetails(){
        return new ApiInfo(
                "Hotel Management API",
                "customer-service-api",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("Ni3","localhost","ni3@epam.com"),
                "API License",
                "localhost",
                Collections.emptyList()
        );
    }

}
