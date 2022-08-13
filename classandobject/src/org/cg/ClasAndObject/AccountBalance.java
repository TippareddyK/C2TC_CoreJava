package org.cg.ClasAndObject;

public class AccountBalance {

	public static void main(String[] args) {
		Balance acc=new Balance("Tippareddy ",-1);
		Balance current1=new Balance("Basava ",100);
		Balance current2=new Balance("vishwa",10);
		Balance current3=new Balance("Raghav ",-1);
		Balance current4=new Balance("sandeep ",250);
		Balance current5=new Balance("tarun ",60);
		acc.show();
		current1.show();
		current2.show();

	}

}
