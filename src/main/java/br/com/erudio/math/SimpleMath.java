package br.com.erudio.math;

import org.springframework.web.bind.annotation.PathVariable;

public class SimpleMath {
	
	public Double sum(@PathVariable(value = "numberOne") Double numberOne, @PathVariable(value = "numberTwo") Double numberTwo) throws Exception {	
		return numberOne + numberTwo;
	}
	
	public Double subtract(@PathVariable(value = "numberOne") Double numberOne, @PathVariable(value = "numberTwo") Double numberTwo) throws Exception {	
		return numberOne - numberTwo;
	}
	
	public Double multiply(@PathVariable(value = "numberOne") Double numberOne, @PathVariable(value = "numberTwo") Double numberTwo) throws Exception {	
		return numberOne * numberTwo;
	}
	
	public Double divide(@PathVariable(value = "numberOne") Double numberOne, @PathVariable(value = "numberTwo") Double numberTwo) throws Exception {	
		return numberOne / numberTwo;
	}
	
	public Double mean(@PathVariable(value = "numberOne") Double numberOne, @PathVariable(value = "numberTwo") Double numberTwo) throws Exception {	
		return (numberOne + numberTwo) / 2;
	}
	
	public Double square(@PathVariable(value = "number") Double number) throws Exception {	
		return Math.sqrt(number);
	}
}
