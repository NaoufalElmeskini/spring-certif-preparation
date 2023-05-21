package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

    @Pointcut("execution(void org.example.service.HelloService.hello(..))")
    public void helloMethod(){}

    @Before(value = "helloMethod()")
    public void afterHello() {
        System.out.println("before hello...");
    }
//
//    @Around("execution(void org.example.service.HelloService.hello(..))")
//    public void aroundHello(ProceedingJoinPoint pjp) throws Throwable {
//        String signatureName = pjp.getSignature().getName();
//        System.out.println("around, before proceeding");
//        pjp.proceed();
//        System.out.println("around, after proceeding");
//    }
}
