package org.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyTestConf {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
