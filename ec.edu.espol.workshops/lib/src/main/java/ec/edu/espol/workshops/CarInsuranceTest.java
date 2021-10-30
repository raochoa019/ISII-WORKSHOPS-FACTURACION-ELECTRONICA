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
		int esperado = 300;
		CarInsurance c = new CarInsurance(35,'H',"married");
		int estado = c.calculatedPremiumCar();
		assertEquals(esperado,estado,0); 
	}
	
	
	

}
