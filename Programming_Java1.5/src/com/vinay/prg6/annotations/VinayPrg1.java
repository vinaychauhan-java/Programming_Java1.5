package com.vinay.prg6.annotations;

import java.util.Date;

class Vipin {
	public void getData() {
		System.out.println("Vipin :: Method : getData");
	}
}

public class VinayPrg1 extends Vipin{

// @Deprecated : If any class or method has been annotated with @Deprecated, it means when the developer will use that class or method, he will get warning not to use that class or method because there is any other better class or method is available to fulfill that requirement.
// @SuppressWarnings : This annotation removes the compile time warning
// @Override : If we use this annotation with a method, it ensures that this is superclass method and not a new method	
	
	@SuppressWarnings("deprecation")
	static void displayDate(){
	    System.out.println("Today's Date is "+(new Date()).getDate());
	}
	
	public static void main(String[] args) {
		displayDate();
		Vipin obj = new Vipin();
		obj.getData();
	}
	
	@Override
	public void getData() {
		System.out.println("Vipin :: Method : getData");
	}
	

}
