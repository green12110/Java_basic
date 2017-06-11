package com.test;

import java.sql.Date;

/**
 * 必须有无参构造方法，利用反射读取的时候使用
 * @author Administrator
 *
 */
public class Student {
	private int sid;
	private String sname;
	private String major;
	private Date birth;
	private float score;
	// 无参的构造方法
	public Student(){
		
	}
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", major=" + major
				+ ", birth=" + birth + ", score=" + score + "]";
	}
	

	
	

}
