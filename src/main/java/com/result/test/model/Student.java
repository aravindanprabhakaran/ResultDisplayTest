package com.result.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private long sregno;
	private String sname;
	private String gpa;

	public long getSregno() {
		return sregno;
	}

	public void setSregno(long sregno) {
		this.sregno = sregno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [sRegNo=" + sregno + ", sName=" + sname + ", gpa=" + gpa + "]";
	}

}
