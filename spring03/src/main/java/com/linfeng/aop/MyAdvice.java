package com.linfeng.aop;
public class MyAdvice {

    //前置通知，方法名是自己定义的
    public void before() {
        System.out.println("这是前置通知！");
    }
    //后置通知
    public void afterReturning() {
        System.out.println("这是后置通知(如果出现异常不会调用)");
    }
    //异常通知
    public void afterException() {
        System.out.println("异常出现了！");
    }
    //后置通知
    public void after() {
        System.out.println("这是后置通知(出现异常也会调用)");
    }
}