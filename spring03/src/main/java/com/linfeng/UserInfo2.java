package com.linfeng;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserInfo2 {
	private Set<String> sets;
	
	private List<Department> list;
	
	private Map<String,Object> map;
	
	private Department department;
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public void setList(List<Department> list) {
		this.list = list;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Set<String> getSets() {
		return sets;
	}

	public List<Department> getList() {
		return list;
	}

	public Map<String, Object> getMap() {
		return map;
	}
	
	

}
