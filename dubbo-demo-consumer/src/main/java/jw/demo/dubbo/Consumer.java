package jw.demo.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("classpath:spring-dubbo-consumer.xml")
public class Consumer {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(Consumer.class, args);

    }
}
