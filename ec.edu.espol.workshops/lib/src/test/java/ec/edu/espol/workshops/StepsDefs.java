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
	 public CarInsurance calculated;

	 
	 @Given("age is {int}")
	 public void age_is(Integer age){
		 this.age = age;
		 this.genre = 'M';
		 this.maritalStatus = "NOT MARRIED";
	 }
	 
	 @Given("marital status is {string}, genre is {string}, age is {int}")
	 public void marital_status_is_genre_is_age_is(String maritalStatus,String genre,Integer age) {
		 this.maritalStatus = maritalStatus;
		 this.genre = genre.charAt(0);
		 this.age = age;
	 }
	 	 
	 @Given("genre is {string}, age is {int}")
	 public void genre_is_age_is(String genre,Integer age) {
		 this.genre = genre.charAt(0);
		 this.age = age;
	 }
	 
	 @When("calculate the insurance premium")
	 public void calculate_the_insurance_premium() {
		 calculated = new CarInsurance(this.age,this.genre,this.maritalStatus);
		 this.answer = calculated.calculatedPremiumCar();
	 }
	 
	 @Then("I should be told {int}")
	 public void I_should_be_told(int expectedAnswer){
		 assertEquals(expectedAnswer,answer);
	 }
	 
	 
}