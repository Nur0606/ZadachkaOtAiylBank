package peaksoft.zadachkaotaiylbank.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("ZadachkaOtAiylBank").version("1.0").description("API documentation for ZadachkaOtAiylBank"));
    }
}