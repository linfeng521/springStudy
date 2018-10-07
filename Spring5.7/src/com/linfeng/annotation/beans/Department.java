package com.linfeng.annotation.beans;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private Integer userId;
	private String name;
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "部门编号："+userId+"部门名称："+name;
	}


	public Department(Integer userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public Department() {
		this.userId = 10000;
		this.name = "default";
	}
	
}
