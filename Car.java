package Abstractclass;

public interface Car {
	
	// only final and static variable are defined
	int wheels=4;
	
	//Always define abstract methods--
	//no method body --
	//only method declaration 
	//we achieve 100% abstraction
	// can not create object of interface

	public void start();
	public void stop();
	public void refuel();

}
