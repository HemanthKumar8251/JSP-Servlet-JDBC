package com.hemanth.web;

import java.io.IOException;

import com.hemanth.web.dao.StudentDao;
import com.hemanth.web.modle.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class getStudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid = Integer.parseInt(request.getParameter("sid"));
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(sid);
		
		RequestDispatcher rd = request.getRequestDispatcher("Student.jsp");
		rd.forward(request, response);
	}

}