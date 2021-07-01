package org.cts.core;

public class Dept {
	private int dno;
	private String dname;
	private String loc;
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	public Dept(int dno, String dname, String loc) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
