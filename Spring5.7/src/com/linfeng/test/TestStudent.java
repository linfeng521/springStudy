package com.linfeng.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linfeng.beans.Student;

public class TestStudent {
	/**
	 * 测试依赖注入属性注入(常用).构造器注入(索引从0开始)
	 * 引入其他的bean使用ref
	 */
	@Test 
	public void test(){
		//ApplicationContext是BeanFactory的子接口， 提供了更多的高级特性
		AbstractApplicationContext bf = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student)bf.getBean("student");
		System.out.println(student);
		bf.close();
	}
}
