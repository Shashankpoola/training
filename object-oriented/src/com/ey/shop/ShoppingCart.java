package com.ey.shop;

import java.util.ArrayList;

import com.ey.bank.BalanceException;

public class ShoppingCart {

	
	private ArrayList<Product> products;
	
	
	private double total;
	private int index;
	
	public ShoppingCart(){
		
		products = new ArrayList<Product>();
	}
	public void addToCart(Product p) throws CartException
	{
		
		products.add(p);
//		if(index== products.length)
//			throw new CartException (" Your cart is full...");
//		else {
//		products[index] = p;
//		index++;
		total += p.getPrice();
//	}
	}
	 
	public void checkout()
	{
		System.out.println("Your order Summary");
//		for (int i = 0; i < index; i++) {
//			products[i].print();
//			
//		}
//	System.out.println("Total Amount			 " + total);
//		
		products.forEach(System.out::println);
		System.out.println("Total Amount			 " + total);
	}
	
}
