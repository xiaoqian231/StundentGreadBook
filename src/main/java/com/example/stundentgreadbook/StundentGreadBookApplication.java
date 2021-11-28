package com.example.stundentgreadbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class StundentGreadBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(StundentGreadBookApplication.class, args);
    }

}
