package am.itspace.springapachekafkaproducerexample.resource;

import am.itspace.springapachekafkaproducerexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

    private static final String TOPIC = "Kafka_Example";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @GetMapping("/publish/{name}/{dept}/{salary}")
    public String post(@PathVariable("name") String name, @PathVariable("dept") String dept, @PathVariable("salary") long salary){

        kafkaTemplate.send(TOPIC, new User(name,dept,salary));

        return "Publish successful";

    }
}
