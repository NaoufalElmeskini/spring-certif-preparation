package org.example;

import org.example.infra.MyConfig;
import org.example.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(MyConfig.class);

        HelloService bean = applicationContext.getBean(HelloService.class);
        bean.hello();
    }
}
