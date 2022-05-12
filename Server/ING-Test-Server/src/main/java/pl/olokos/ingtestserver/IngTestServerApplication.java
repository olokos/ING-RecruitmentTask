package pl.olokos.ingtestserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("model")
public class IngTestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IngTestServerApplication.class, args);
    }

}
