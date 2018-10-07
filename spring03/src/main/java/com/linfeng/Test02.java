package com.linfeng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
		UserInfo userInfo = (UserInfo)ac.getBean("userInfo");
		System.out.println(userInfo);
		UserInfo userInfo1 = (UserInfo)ac.getBean("userInfo");
		System.out.println(userInfo==userInfo1);
		UserInfoContainer  userList = (UserInfoContainer) ac.getBean("userList");
		for(UserInfo user: userList.getList()) {
			System.out.println(user);
		}
		System.out.println(userList);
	}

}
