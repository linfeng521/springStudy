package com.linfeng;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//从Beanfactory获取bean是通过ClassPathXmlApplicationContext获取的
		//ApplicationContext是BeanFactory的子接口， 提供了更多的高级特性
		AbstractApplicationContext bf = new ClassPathXmlApplicationContext("spring.xml");
		UserInfo userInfo =(UserInfo) bf.getBean("userInfo");
		System.out.println(userInfo);
		//Department userInfo1 =(Department) bf.getBean("department");
		//System.out.println(userInfo1);
		UserInfo2 userInfo2 = (UserInfo2)bf.getBean("userInfo1");
		Set<String> sets = userInfo2.getSets();
		Iterator<String> iterator = sets.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		Map<String,Object> map = userInfo2.getMap();
		System.out.println(map.get("name"));
		
		List<Department> list =userInfo2.getList();
		for(Department list1:list) {
			System.out.println(list1);
		}
		bf.close();
	}
}
