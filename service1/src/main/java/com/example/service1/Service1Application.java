package com.example.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Service1Application {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }

    @GetMapping("/service")
    public ResponseEntity<String> serviceName(){
        ResponseEntity<String> responseEntity = new RestTemplate().getForEntity("http://localhost:1880/service", String.class);
        return responseEntity;
    }
}
