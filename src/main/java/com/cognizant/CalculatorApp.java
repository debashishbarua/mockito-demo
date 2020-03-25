package com.cognizant;

/**
 * Hello world!
 *
 */
public class CalculatorApp {

	private CalculatorService calculatorService;

	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	public int add(int a, int b) {
		return calculatorService.add(a, b);
	}

	public int sub(int a, int b) {
		return calculatorService.sub(a, b);
	}

	public int mul(int a, int b) {
		return calculatorService.mul(a, b);
	}

	public int div(int a, int b) {
		return calculatorService.div(a, b);
	}
}
