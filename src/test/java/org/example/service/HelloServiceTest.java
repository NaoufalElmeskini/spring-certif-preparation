package org.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;


class HelloServiceTest {
    private HelloService helloService;

    @Test
    public void doit() {
//        given
        this.helloService = new HelloService();
//        when
        int actual = helloService.calculerAddition(1, 5);
//        then
        Assertions.assertEquals(6, actual);
    }


}
