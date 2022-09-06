package org.cg.setget;

public class Box {
	double dbwidth;
	double dbhight;
	double dbdepth;
	public Box() {
		super();
	}
	public Box(double dbwidth, double dbhight, double dbdepth) {
		super();
		this.dbwidth = dbwidth;
		this.dbhight = dbhight;
		this.dbdepth = dbdepth;
	}
	public void cal() {
		double result=(dbwidth*dbhight*dbdepth);
		System.out.println("result is"+result);
	}
	double calcvolume() {
		return dbwidth*dbhight*dbdepth;
	}
	public double getDbwidth() {
		return dbwidth;
	}
	public void setDbwidth(double dbwidth) {
		this.dbwidth = dbwidth;
	}
	public double getDbhight() {
		return dbhight;
	}
	public void setDbhight(double dbhight) {
		this.dbhight = dbhight;
	}
	public double getDbdepth() {
		return dbdepth;
	}
	public void setDbdepth(double dbdepth) {
		this.dbdepth = dbdepth;
	}
	
	
	

}
