package com.linfeng;

import java.util.List;
import java.util.Map;

public class UserInfoContainer {
	private List<UserInfo> list ;
	private Map<String, UserInfo> map;
	public List<UserInfo> getList() {
		return list;
	}

	public void setList(List<UserInfo> list) {
		this.list = list;
	}

	
	public Map<String, UserInfo> getMap() {
		return map;
	}

	public void setMap(Map<String, UserInfo> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "UserInfoContainer [list=" + list + ", map=" + map + "]";
	}

	
	

}
