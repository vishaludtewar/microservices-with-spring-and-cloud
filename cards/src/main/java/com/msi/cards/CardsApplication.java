package com.msi.cards;

import com.msi.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "MsiBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Vishal Udtewar",
						email = "developer@msibank.com",
						url = "https://www.msibank.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.msibank.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "MsiBank Accounts microservice REST API Documentation",
				url = "https://www.msibank.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
