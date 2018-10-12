package com.mj.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class Zipkin_9111_StartApp {
    public static void main(String[] args) {
        SpringApplication.run(Zipkin_9111_StartApp.class, args);
    }

}
