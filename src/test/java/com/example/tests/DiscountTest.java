package com.example.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Discount;

public class DiscountTest {
    @Test
    void testWith101() {
		Discount discount = new Discount();
		
		double total = discount.applyDiscount(101);

        assertEquals(80.8, total, 0.01);
    }

//    @Test
//    void testWith99() {
//		Discount discount = new Discount();
//		
//		double total = discount.applyDiscount(99);
//
//        assertEquals(99.0, total, 0.01);
//    }


	@Test
    void testWith100() {
		Discount discount = new Discount();
		
		double total = discount.applyDiscount(100);

        assertEquals(100, total, 0.01);
    }

}
