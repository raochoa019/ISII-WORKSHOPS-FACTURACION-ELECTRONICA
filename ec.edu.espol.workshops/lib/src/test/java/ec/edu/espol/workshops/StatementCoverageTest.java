package ec.edu.espol.workshops;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementCoverageTest {

	@Test
	void tcs1() {
		int esperado = 2000;
		CarInsurance c = new CarInsurance(18,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	void tcs2() {
		int esperado = 200;
		CarInsurance c = new CarInsurance(50,'F',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	void tcs3() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(86,'M',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}

}
