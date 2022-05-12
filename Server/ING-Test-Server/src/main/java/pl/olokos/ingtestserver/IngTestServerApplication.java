package pl.olokos.ingtestserver;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan("model")
public class IngTestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IngTestServerApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption, @Value("${application-version}") String appVersion) {

        return new OpenAPI()
                .info(new Info()
                        .title("Spring Boot Rest Server API")
                        .version(appVersion)
                        .contact(new Contact().name("olokos").email("olokos@wp.pl"))
                        .description(appDesciption)
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("GNU GPLv3").url("https://github.com/olokos/ING-RecruitmentTask/blob/main/LICENSE")));
    }

}
