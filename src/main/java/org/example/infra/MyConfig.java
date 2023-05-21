package org.example.infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.service", "org.example.aop"})
@EnableAspectJAutoProxy
public class MyConfig {
}
