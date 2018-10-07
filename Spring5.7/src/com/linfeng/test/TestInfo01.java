package com.linfeng.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linfeng.beans.Department;
import com.linfeng.beans.UserInfo;
import com.linfeng.beans.UserInfo2;

public class TestInfo01 {
	/**
	 * 测试依赖注入属性注入(常用).构造器注入(索引从0开始)
	 * 引入其他的bean使用ref
	 */
	@Test 
	public void test01(){
		//ApplicationContext是BeanFactory的子接口， 提供了更多的高级特性
		AbstractApplicationContext bf = new ClassPathXmlApplicationContext("spring.xml");
		UserInfo userInfo = (UserInfo)bf.getBean("userInfo");
		System.out.println(userInfo);
		Department department = (Department) bf.getBean("department");
		System.out.println(department);
		bf.close();
	}
	/**
	 * 集合注入测试
	 */
	@Test
	public void test02() {
		AbstractApplicationContext bf = new ClassPathXmlApplicationContext("spring.xml");
		UserInfo2 userInfo2 = (UserInfo2)bf.getBean("userInfo2");
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
