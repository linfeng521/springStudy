package com.linfeng.dao;

import java.util.List;

public interface TeacherDao {
	/**
	 * crud
	 */
	public void addTeacher(Teacher teacher);
	public void delete(Integer id);
	public void update(Teacher teacher);
	/**
	 * 查询的三种基本操作
	 * 一: 查询表中的记录行
	 * @return
	 */
	public Long getCounts();
	/**
	 * 查询的三种基本操作二:
	 * 查询返回对象
	 * jdbcTemplate.queryForObject(sql, object, RowMapper<T> rowMapper);
	 * @param id
	 * @return
	 */
	public Teacher getTeacherById(int id);
	
	/**
	 * 查询的三种基本操作三: 
	 * 查询返回Teachers列表
	 * query(sql, object, RowMapper<T> rowMapper)
	 * @return
	 */
	public List<Teacher> getTeacherList();
	List<Teacher> getTeacherListByPrepare(int number);
}
