package com.cognizant;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;

import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorAppTester {

	// @InjectMocks annotation is used to create and inject the mock object
	@InjectMocks
	private CalculatorApp calculatorApp = new CalculatorApp();

	// @Mock annotation is used to create the mock object to be injected
	@Mock
	CalculatorService calcService;

	@Test
	public void testAdd() {
		// add the behavior of calc service to add two numbers
		when(calcService.add(10, 20)).thenReturn(30);

		// test the add functionality
		Assert.assertEquals(calculatorApp.add(10, 20), 30);
	}

	@Test
	public void testSub() {
		// add the behavior of calc service to add two numbers
		when(calcService.sub(100, 20)).thenReturn(80);

		// test the add functionality
		Assert.assertEquals(calculatorApp.sub(100, 20), 80);
	}

	@Test
	public void testMul() {
		// add the behavior of calc service to add two numbers
		when(calcService.mul(10, 20)).thenReturn(200);

		// test the add functionality
		Assert.assertEquals(calculatorApp.mul(10, 20), 200);
	}

	@Test
	public void testDiv() {
		// add the behavior of calc service to add two numbers
		when(calcService.div(100, 20)).thenReturn(5);

		// test the add functionality
		Assert.assertEquals(calculatorApp.div(100, 20), 5);
	}

}
