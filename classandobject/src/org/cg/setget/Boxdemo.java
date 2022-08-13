package org.cg.setget;

public class Boxdemo {

	public static void main(String[] args) {
		Box box1=new Box();
		System.out.println(box1.calcvolume());
		
		Box box2=new Box(10,20,30);
		System.out.println(box2.calcvolume());
		
		Box box3=new Box();
		box3.setDbdepth(10);
		box3.setDbhight(11);
		box3.setDbwidth(12);
		System.out.println(box3.calcvolume());
		
		

	}

}
