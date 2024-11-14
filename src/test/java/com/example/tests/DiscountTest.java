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
}
