package com.jparepositoryexample.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDemo {
	
	@Id
	private int sid;
	private String sname;	
	private String sub;

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}
public StudentDemo(int sid, String sname, String sub) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sub = sub;
}
public StudentDemo() {
	super();
}

}
