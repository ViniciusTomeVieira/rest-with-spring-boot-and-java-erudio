package br.com.erudio.math;

public class SimpleMath {
	
	public Double sum(Double numberOne, Double numberTwo) throws Exception {	
		return numberOne + numberTwo;
	}
	
	public Double subtract(Double numberOne, Double numberTwo) throws Exception {	
		return numberOne - numberTwo;
	}
	
	public Double multiply(Double numberOne, Double numberTwo) throws Exception {	
		return numberOne * numberTwo;
	}
	
	public Double divide(Double numberOne, Double numberTwo) throws Exception {	
		return numberOne / numberTwo;
	}
	
	public Double mean(Double numberOne, Double numberTwo) throws Exception {	
		return (numberOne + numberTwo) / 2;
	}
	
	public Double square(Double number) throws Exception {	
		return Math.sqrt(number);
	}
}
