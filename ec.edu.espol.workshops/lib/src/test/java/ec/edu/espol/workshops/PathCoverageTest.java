package ec.edu.espol.workshops;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PathCoverageTest {

	@Test
	void tcp1() {
		int esperado = 500;
		CarInsurance c = new CarInsurance(30,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcp2() {
		int esperado = 2000;
		CarInsurance c = new CarInsurance(24,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcp3() {
		int esperado = 300;
		CarInsurance c = new CarInsurance(30,'F',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcp4() {
		int esperado = 400;
		CarInsurance c = new CarInsurance(50,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcp5() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(86,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcp6() {
		int esperado = 200;
		CarInsurance c = new CarInsurance(50,'M',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcp7() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(86,'M',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}

}
