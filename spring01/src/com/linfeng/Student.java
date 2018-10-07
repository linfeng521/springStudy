package com.linfeng;

import org.springframework.beans.factory.annotation.Required;

public class Student {
   private Integer age;
   private String name;
   @Required
   public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
      return age;
   }
   @Required
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   
   public void init() {
	   System.out.println("this is init in StudentInfo");
   }
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}
   
}