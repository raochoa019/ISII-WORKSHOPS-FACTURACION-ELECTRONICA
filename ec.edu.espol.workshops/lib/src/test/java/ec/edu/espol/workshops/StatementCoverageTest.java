package ec.edu.espol.workshops;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementCoverageTest {

	@Test
	void test() {
		int esperado = 200;
		CarInsurance c = new CarInsurance(50,'M',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}

}
