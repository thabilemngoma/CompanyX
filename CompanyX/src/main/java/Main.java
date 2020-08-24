package com.codeflex.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"clients"})
public class SpringbootRestOnlineStore {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestOnlineStore.class, args);
    }
}