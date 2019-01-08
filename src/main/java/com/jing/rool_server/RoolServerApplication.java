package com.jing.rool_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RoolServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoolServerApplication.class, args);
    }

}

