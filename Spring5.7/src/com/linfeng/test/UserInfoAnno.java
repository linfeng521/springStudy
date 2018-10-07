package com.linfeng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linfeng.annotation.beans.UserInfo;


public class UserInfoAnno {
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans_annotion.xml");
		UserInfo userInfo = (UserInfo) ac.getBean("userInfo");
		userInfo.setName("linfeng");
		userInfo.setName("linlan");
		System.out.println(userInfo);
	}
}
