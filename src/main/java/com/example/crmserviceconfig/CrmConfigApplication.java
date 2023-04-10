package com.example.crmserviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CrmConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmConfigApplication.class, args);
    }

}
