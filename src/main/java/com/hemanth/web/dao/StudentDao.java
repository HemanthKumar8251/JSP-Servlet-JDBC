package com.hemanth.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.hemanth.web.modle.Student;

public class StudentDao {
	public Student getStudent(int sid) {
		Student s = new Student();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hemanth","root","Hemanth@8251");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student_details where sid="+sid);
			if(rs.next()) {
				s.setSid(rs.getInt("sid"));
				s.setName(rs.getString("sname"));
				s.setDept(rs.getString("branch"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return s;
	}
}
