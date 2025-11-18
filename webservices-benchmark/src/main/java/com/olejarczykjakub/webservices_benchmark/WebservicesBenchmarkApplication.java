package com.olejarczykjakub.webservices_benchmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebservicesBenchmarkApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebservicesBenchmarkApplication.class, args);
	}

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
