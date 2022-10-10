package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
System.out.println("270000");		
	}

	@Override
	public void speed() {
System.out.println("180 Km/per/hr");		
	}
	public static void main(String[] args) {
		Ktm s = new Ktm();
		s.cost();
		s.speed();
	}

}
