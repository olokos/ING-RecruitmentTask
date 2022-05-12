package pl.olokos.ingtestserver;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot Rest Server application",
                description = "Made by olokos " +
                        "for purposes of recruitment to ING",
                version = "0.1",
                contact = @Contact(
                        name = "olokos",
                        email = "olokos@wp.pl"
                ),
                license = @License(
                        name = "GNU GPLv3",
                        url = "https://github.com/olokos/ING-RecruitmentTask/blob/main/LICENSE")),
        servers = @Server(url = "http://localhost:8080")
)
class OpenAPIConfiguration {
}
