package com.linfeng.test;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linfeng.beans.Student;
import com.linfeng.beans.UserInfo;
import com.linfeng.beans.UserInfo2;

public class StudentTest {
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student) ac.getBean("student");
		Student student2 = (Student) ac.getBean("student2");
		UserInfo userInfo = (UserInfo) ac.getBean("userInfo");
		UserInfo userInfo2 = (UserInfo) ac.getBean("userInfo2");
		
		UserInfo2 userInfo02 = (UserInfo2) ac.getBean("userInfo02");
		Map<String, Object> map = userInfo02.getMap();
		System.out.println(map);
		System.out.println(student);
		
		System.out.println(student2);
		
		System.out.println(userInfo2);
		
		System.out.println(userInfo02);
	}
}
