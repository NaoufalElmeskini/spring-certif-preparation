package org.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = MyTestConf.class)
class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void doitCalculerLAdditionAlgebrique() {
//        given
//        when
        int actual = helloService.calculerAddition(1, 5);
//        then
        Assertions.assertEquals(6, actual);
    }


}
