package com.example.test.testCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.test.Calculator.Calculator;

public class TestCalculator {
	
	private static  Calculator calc=null;

	@BeforeAll
	public static void createObjectForCalculator() {
		 calc = new Calculator();			
	}
	
	@AfterAll
	public static  void destroyObjectOfCalculator() {
		 calc = null;			
	}

	@Test
	public void testSum() {
		Integer actualResult =calc.sum(20, 20);
		Integer expectedResult=40;
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	
	@Test
	public void testMultiply() {
		Integer actualResult =calc.multiply(20, 20);
		Integer expectedResult=400;
	
		assertEquals(expectedResult, actualResult);
		
	}
}
