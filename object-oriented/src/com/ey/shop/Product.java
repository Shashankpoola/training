package com.ey.shop;

/**
 * This class represents
 * 
 * @author shashank
 */

public class Product {

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	private String name;
	private double price;

	/**
	 * This is default constructor
	 */

	public Product() {

	}

	/**
	 * @param name
	 * @param name
	 * @param price
	 */

	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println("Name  		" + name + "\tPrice" + price);
	}

	public double getPrice() {
		return price;
	}

}
