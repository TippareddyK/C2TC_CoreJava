package org.cg.constructordemo;

public class example2 {
	String name;
	int id;

	public example2(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	

	void display() {
		System.out.println(name+" "+id);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example2 e1=new example2("reddy",25);
		example2 e2=new example2(null, 0 );
		e1.display();
		e2.display();
		
		
		

	}

}
