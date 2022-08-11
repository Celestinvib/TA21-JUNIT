package TA21.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import calculadora.Calculadora;

class AppTest {
	
	@Test
	public void testAdd() {
		Calculadora calc = new Calculadora();
		double r = calc.add(2, 4);
		double esperado = 6;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testSusbtract() {
		Calculadora calc = new Calculadora();
		double r = calc.susbtract(4, 2);
		double esperado = 2;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testMultiply() {
		Calculadora calc = new Calculadora();
		double r = calc.multiply(4, 2);
		double esperado = 8;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testSplit() {
		Calculadora calc = new Calculadora();
		double r = calc.split(4, 2);
		double esperado = 2;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testSquareRoot() {
		Calculadora calc = new Calculadora();
		double r = calc.squareRoot(49);
		double esperado = 7;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testRaisedTo() {
		Calculadora calc = new Calculadora();
		double r = calc.raisedTo(3);
		double esperado = 9;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testOneSplitNum() {
		Calculadora calc = new Calculadora();
		double r = calc.oneSplitNum(8);
		double esperado = 0.125;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testSetGetNum1() {
		Calculadora calc = new Calculadora();
		calc.setNum1(2);
		double r = calc.getNum1();
		double esperado = 2;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testSetGetNum2() {
		Calculadora calc = new Calculadora();
		calc.setNum2(2);
		double r = calc.getNum2();
		double esperado = 2;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testSetGetOp() {
		Calculadora calc = new Calculadora();
		calc.setOp("add");
		String r = calc.getOp();
		String esperado = "add";
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testSetGetR() {
		Calculadora calc = new Calculadora();
		calc.setR(2);
		double r = calc.getR();
		double esperado = 2;
		assertEquals(esperado, r);	
	}
}
