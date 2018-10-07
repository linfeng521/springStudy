package com.linfeng.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

public class TeacherDaoImpl implements TeacherDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Teacher getTeacherById(int id) {
		String sql = "select * from teacher where id = ?";

		Teacher teacher = jdbcTemplate.queryForObject(sql, new myResult(), id);
		return teacher;
	}

	@Override
	public List<Teacher> getTeacherList() {
		String sql = "select * from teacher";
		
		List<Teacher> teachers = jdbcTemplate.query(sql, new myResult());
		
		return teachers;
	}
	
	@Override
	public List<Teacher> getTeacherListByPrepare(int number) {
		String sql = "select * from teacher where id >= ?";
		PreparedStatementCreator psc = new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, number);
				return ps;
			}
		};
		jdbcTemplate.query(psc , new myResult());
		
		List<Teacher> teachers = jdbcTemplate.query(psc, new myResult());
		
		return teachers;
	}

	@Override
	public Long getCounts() {
		String sql = "select count(*) from teacher";
		Long counts = jdbcTemplate.queryForObject(sql, Long.class);
		return counts;
	}

	@Override
	public void addTeacher(Teacher teacher) {
	String sql = "insert into teacher(name,password,message) values(?,?,?)";
	jdbcTemplate.update(sql,teacher.getName(),teacher.getPassword(),teacher.getMessage());
	}

	@Override
	public void delete(Integer id) {
	
		
	}

	@Override
	public void update(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

}

class myResult implements RowMapper<Teacher> {
	@Override
	public Teacher mapRow(ResultSet resultSet, int i) throws SQLException {
		Teacher teacher = new Teacher();
		teacher.setId(resultSet.getInt("Id"));
		teacher.setName(resultSet.getString("Name"));
		teacher.setPassword(resultSet.getString("password"));
		teacher.setMessage(resultSet.getString("message"));
		return teacher;
	}
}
