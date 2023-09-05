package com.ey.adapter;

public class AdapterDemo {  //It is a structural pattern

	public static void main(String[] args) {

		Turbo t = new SportsCar("Ferrari California", 220);
		System.out.println(t);

		System.out.println("Top Speed: " + t.getSpeed());

		Nitro n1 = new SpeedAdapter(t);
		System.out.println("Top Speed Kms: " + n1.getSpeedKms());

		Turbo t1 = new SportsCar("Porshe 911", 250);
		System.out.println(t1);

		System.out.println("Top Speed: " + t1.getSpeed());

		Nitro n2 = new SpeedAdapter(t1);
		System.out.println("Top Speed Kms: " + n2.getSpeedKms());

	}

}
