package com.humber.githubspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitHubSpringDemoApplication.class, args);
    }

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }


    @GetMapping("/pin")
    public String pin(){
        return "pong";
    }

}
