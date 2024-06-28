import org.springframework.context.annotation.Bean;

@Bean
public OpenAPI customOpenAPI(){
    return new OpenAPI().addSecurityItem(new SecurityRequirement()
            .addList(schemeName)).components(new Components()
            .addSecuritySchemes(
                    schemeName, new SecurityScheme()
                            .name(schemeName)
                            .type(SecurityScheme.Type.HTTP)
                            .bearerFormat(bearerFormat)
                            .in(SecurityScheme.In.HEADER)
                            .scheme(scheme)
            )).info(new Info()
            .title("Document Management API")
            .description("API information")
            .version("1.0")

    );
}
}