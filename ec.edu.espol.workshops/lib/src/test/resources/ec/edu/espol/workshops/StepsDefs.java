package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
	 private int age;
	 private String maritalStatus;
	 private Character genre;
	 private int answer ;
	 
	 @Given("age is 22")
	 public void age_is_22() {
		 this.age = 22;
	 }
	 
	 @Given("age is 50")
	 public void age_is_50() {
		 this.age = 50;
	 }
	 
	 @Given("age is 85")
	 public void age_is_85() {
		 this.age = 85;
	 }
	 
	 @Given("genre is 'M' ")
	 public void genre_is_M() {
		 this.genre = 'M';
	 }
	 
	 @Given("genre is 'F' ")
	 public void genre_is_F() {
		 this.genre = 'F';
	 }
	 
	 @Given("marital status is 'MARRIED' ")
	 public void maritalStatus_is_MARRIED() {
		 this.maritalStatus = "MARRIED";
	 }
	 
	 @Given("marital status is 'NOT MARRIED' ")
	 public void maritalStatus_is_NOT_MARRIED() {
		 this.maritalStatus = "NOT MARRIED";
	 }
	 
	 @Given("age is {int}")
	 public void age_is(int age) {
		 this.age = age;
	 }
	 
	 @Given("genre is {Character}")
	 public void genre_is(Character genre) {
		 this.genre = genre;
	 }
	 
	 @Given("marital status is {String}")
	 public void maritalStatus_is(String maritalStatus) {
		 this.maritalStatus = maritalStatus;
	 }
	 
	 @When("calculate the insurance premium")
	 public void calculate_insurance_premium_1() {
		 CarInsurance calculated = new CarInsurance(this.age);
		 this.answer = calculated.calculatedPremiumCar(); 
	 }
	 
	 @When("calculate the insurance premium")
	 public void calculate_insurance_premium_2() {
		 CarInsurance calculated = new CarInsurance(this.age,this.genre);
		 this.answer = calculated.calculatedPremiumCar();
	 }
	 
	 @When("calculate the insurance premium")
	 public void calculate_insurance_premium_3() {
		 CarInsurance calculated = new CarInsurance(this.age,this.genre,this.maritalStatus);
		 this.answer = calculated.calculatedPremiumCar();
	 }
	 
	 @Then("I should be told {int}")
	 public void i_should_be_told(int expectedAnswer) {
		 assertEquals(expectedAnswer, this.answer);
	 } 
	 
	 
}