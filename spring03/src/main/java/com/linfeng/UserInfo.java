package com.linfeng;

public class UserInfo {
	private String name;
	private Department department;
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setName(String name) {
		System.out.println("为bean设置值"+name);
		this.name = name;
	}
	
	public String toString() {
		return "姓名："+name+"信息："+department;
	}

	public UserInfo() {
		System.out.println("-实例化");
	}
	
	public void init() {
		System.out.println("-----开始初始化");
	}
	
	public void destory() {
		System.out.println("--销毁了");
	}
	
	
}
