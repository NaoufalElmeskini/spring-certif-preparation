package org.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig
class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void doit() {
//        given
//        when
        int actual = helloService.calculerAddition(1, 5);
//        then
        Assertions.assertEquals(6, actual);
    }

    @Configuration
    static class TestConf{
        @Bean
        public HelloService helloService() {
            return new HelloService();
        }
    }

}
