package com.hemanth.web.dao;

import com.hemanth.web.modle.Student;

public class StudentDao {
	public Student getStudent(int sid) {
		Student s = new Student();
		s.setSid(1);
		s.setName("Hemanth");
		s.setDept("CSE");
		return s;
	}
}
