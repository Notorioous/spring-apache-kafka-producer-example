package am.itspace.springapachekafkaproducerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringApacheKafkaProducerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApacheKafkaProducerExampleApplication.class, args);
    }

}
