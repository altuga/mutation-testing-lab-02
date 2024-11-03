package com.example;

public class Discount {
	private final double PERCENT_OFF = 0.2;
	
	public double applyDiscount(double total) {
	   double totalWithDiscount = total;
	   if(total > 100) {
	      totalWithDiscount = totalWithDiscount - (totalWithDiscount * PERCENT_OFF);
	   }
	   return totalWithDiscount;
	}

}
