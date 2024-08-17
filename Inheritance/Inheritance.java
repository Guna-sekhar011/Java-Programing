package com.inheritance;

class Plane{
	void takeOff() {
		System.out.println("Plane taking off");
	}
	
	void fly() {
		System.out.println("Plane flying");
	}
	
	void land() {
		System.out.println("Plane landing");
	}
}

class CargoPlane extends Plane{
	
	@Override
	void takeOff() {
		System.out.println("Cargo Plane taking off");
	}
	
	@Override
	void fly(){
		System.out.println("Cargo Plane flying");
	}
	
	@Override
	void land() {
		System.out.println("Cargo Plane landing");
	}
	
}

class PassengerPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("Passenger plane taking off");
	}
	
	@Override
	void fly() {
		System.out.println("Passenger Plane flying");
	}
	
	@Override
	void land() {
		System.out.println("Passenger Plane Landing");
	}
}

class FighterPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("Fighter plane taking off");
	}
	
	@Override
	void fly() {
		System.out.println("Fighter Plane flying");
	}
	
	@Override
	void land() {
		System.out.println("Fighter Plane Landing");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		
		System.out.println("________________");
		
		PassengerPlane pp = new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.land();
		
		System.out.println("________________");
		
		FighterPlane fp = new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.land();
		

	}

}
