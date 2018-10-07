package com.linfeng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linfeng.service.UserInfo;
import com.linfeng.service.impl.UserInfoImpl;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserInfo service = (UserInfo)ac.getBean("userInfoImpl");
		service.add();
		//service.abddUser();
	}
}
