package com.cuit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* com.cuit.UserService.*(..))")
    public void pointCut() {
    }

    @Before("execution(*  com.cuit.UserService.*(..)))")
    public void berfore() {

        System.out.println("创建成功");
        System.out.println("before 注解执行");

    }

    /*@After("")
    public void after(){

    }*/
    @After("pointCut()")
    public void after() {

        System.out.println("after 注解执行");
    }

    @AfterThrowing(pointcut = "pointCut()", throwing = "error")
    public void afterThrowing(JoinPoint joinPoint,Throwable error) {
        System.out.println("---后置异常执行---");

    }

}
