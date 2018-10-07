package com.linfeng.jdbc;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linfeng.dao.Teacher;
import com.linfeng.dao.TeacherDaoImpl;
@SuppressWarnings("resource")
public class TeacherDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSelectById() {
		 ApplicationContext context = 
	                new ClassPathXmlApplicationContext("beans_jdbc.xml");
		TeacherDaoImpl teacherDao = (TeacherDaoImpl) context.getBean("teacherDao");
		Teacher teacher = teacherDao.getTeacherById(1);
		System.out.println(teacher);
	}
	
	@Test
	public void testList() {
		 ApplicationContext context = 
	                new ClassPathXmlApplicationContext("beans_jdbc.xml");
		TeacherDaoImpl teacherDao = (TeacherDaoImpl) context.getBean("teacherDao");
		 List<Teacher> teachers = teacherDao.getTeacherList();
		 for (Teacher teacher : teachers) {
			 System.out.println(teacher);
		}
	}
	
	@Test
	public void testListByPrepare() {
		 ApplicationContext context = 
	                new ClassPathXmlApplicationContext("beans_jdbc.xml");
		TeacherDaoImpl teacherDao = (TeacherDaoImpl) context.getBean("teacherDao");
		 List<Teacher> teachers = teacherDao.getTeacherListByPrepare(3);
		 for (Teacher teacher : teachers) {
			 System.out.println(teacher);
		}
	}
	
	
	@Test
	public void testLong() {
		 ApplicationContext context = 
	                new ClassPathXmlApplicationContext("beans_jdbc.xml");
		TeacherDaoImpl teacherDao = (TeacherDaoImpl) context.getBean("teacherDao");
		Long counts = teacherDao.getCounts();
		System.out.println(counts);
	}
	@Test
	public void testAdd() {
		ApplicationContext context = 
	                new ClassPathXmlApplicationContext("beans_jdbc.xml");
		TeacherDaoImpl teacherDao = (TeacherDaoImpl) context.getBean("teacherDao");
		Teacher teacher = new Teacher();
		teacher.setName("admin");
		teacher.setPassword("admin");
		teacher.setMessage("你们好, 我是admin");
		teacherDao.addTeacher(teacher);
	}

}
