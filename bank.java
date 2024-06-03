package Abstractclass;

public abstract class bank {
	
	
	// partial abstraction 
	// hiding the implementation logic -- is called abstraction 
	//abstract class can have 
	//can not create the object of abstract class 
	
	
	public abstract void loan(); // abstract method -- no method body 
	
	
	
	
	// non abstract method 
	public void credit() {
		System.out.println("bank -- credit");
	}
	
	
	public void debit() {
		System.out.println("bank --debit");
	}

	public static void main(String[] args) {
		

	}

}
