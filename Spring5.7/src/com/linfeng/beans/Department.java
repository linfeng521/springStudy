package com.linfeng.beans;

public class Department {
	private Integer userId;
	private String name;
	
	public Department() {}
	public Department(Integer userId, String name) {
		this.userId = userId;
		this.name = name;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "部门编号："+userId+"部门名称："+name;
	}
}
