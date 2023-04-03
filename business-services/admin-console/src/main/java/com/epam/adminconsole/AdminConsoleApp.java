package com.epam.adminconsole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AdminConsoleApp {

    public static void main(String[] args) {
        SpringApplication.run(AdminConsoleApp.class, args);
    }

    @GetMapping("/admin-console/{userId}")
    public String getUser(@PathVariable int userId) {
        return "Admin console for user " + userId;
    }
}
