package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linfeng.bean.Person;
public class Test {
public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    Person person=(Person)context.getBean("chinese");
    person.Speak();
    person=(Person)context.getBean("american");
    person.Speak();
	}
}