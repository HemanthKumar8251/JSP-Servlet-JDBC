package com.hemanth.web.modle;

public class Student {
	private int sid;
	private String name;
	private String dept;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
