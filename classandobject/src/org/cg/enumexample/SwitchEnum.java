package org.cg.enumexample;

public class SwitchEnum {
	enum Choice {choice1,choice2,choice3};

	public static void main(String[] args) {
		Choice ch=Choice.choice1;
		switch(ch) {
		case choice1:{
			System.out.println("1");
			break;
			
		}
		case choice2:{
			System.out.println("2");
			break;
		}
		case choice3:{
			System.out.println("3");
			break;
		}
		
		

	}
	}

}
