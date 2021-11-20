package ec.edu.espol.workshops;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarInsuranceTest {


	@Test
	void test1CalculatedPremiumCar() {
		int esperado = 200;
		CarInsurance c = new CarInsurance(50,'M',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void test2CalculatedPremiumCar() {
		int esperado = 300;
		CarInsurance c = new CarInsurance(65,'F',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void test3CalculatedPremiumCar() {
		int esperado = 500;
		CarInsurance c = new CarInsurance(65,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void test4CalculatedPremiumCar() {
		int esperado = 300;
		CarInsurance c = new CarInsurance(25,'F',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void test5CalculatedPremiumCar() {
		int esperado = 300;
		CarInsurance c = new CarInsurance(25,'f',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void test6CalculatedPremiumCar() {
		int esperado = 300;
		CarInsurance c = new CarInsurance(25,'F',"Not married");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void test7MaritalStatus() {
		String esperado = "NOT MARRIED";
		CarInsurance c = new CarInsurance(25,'F',"Not married");
		String estado = c.getMaritalStatus();
		System.out.println(esperado.equals(c.getMaritalStatus()));
		assertEquals(estado,esperado);
		
	}
	
	@Test
	void test8CalculatedPremiumCar() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(35,'H',"married");
		int estado = c.calculatedPremiumCar();
		assertEquals(esperado,estado,0); 
	}
	
	
	@Test
	void TC1() {
		int esperado = 300;
		CarInsurance c = new CarInsurance(25,'M',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void TC2() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(15,'F',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void TC3() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(85,'M',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void TC4() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(30,'B',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void TC5() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(20,'F',"SINGLE");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void boundaryTC1() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(17,'M',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void boundaryTC2() {
		int esperado = 2000;
		CarInsurance c = new CarInsurance(18,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void boundaryTC3() {
		int esperado = 2000;
		CarInsurance c = new CarInsurance(24,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void boundaryTC4() {
		int esperado = 500;
		CarInsurance c = new CarInsurance(25,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void boundaryTC5() {
		int esperado = 300;
		CarInsurance c = new CarInsurance(44,'F',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void boundaryTC6() {
		int esperado = 200;
		CarInsurance c = new CarInsurance(45,'F',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void boundaryTC7() {
		int esperado = 500;
		CarInsurance c = new CarInsurance(79,'M',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void boundaryTC8() {
		int esperado = 300;
		CarInsurance c = new CarInsurance(80,'F',"NOT MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
	@Test
	void boundaryTC9() {
		int esperado = -1;
		CarInsurance c = new CarInsurance(81,'M',"MARRIED");
		int valor = c.calculatedPremiumCar(); 
		assertEquals(esperado,valor,0);
	}
	
}
