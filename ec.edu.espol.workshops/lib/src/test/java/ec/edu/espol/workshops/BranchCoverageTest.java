package ec.edu.espol.workshops;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BranchCoverageTest {

	@Test
	void tcb1() {
		int esperado = 500;
		CarInsurance c = new CarInsurance(30,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcb2() {
		int esperado = 2000;
		CarInsurance c = new CarInsurance(18,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcb3() {
		int esperado = 300;
		CarInsurance c = new CarInsurance(25,'F',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcb4() {
		int esperado = 400;
		CarInsurance c = new CarInsurance(60,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void tcb5() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(90,'F',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
}
