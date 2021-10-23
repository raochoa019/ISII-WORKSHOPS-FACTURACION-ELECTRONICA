package ec.edu.espol.workshops;

import java.util.Locale;

public class CarInsurance {

	private Integer age;
	private char genre;
	private String maritalStatus;
	
	public CarInsurance() {}
	
	public CarInsurance(Integer age, char genre, String maritalStatus){
		this.age = age;
		this.genre = genre;
		this.maritalStatus = maritalStatus;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Character getGenre() {
		return this.genre;
	} 
	
	public void setGenre(String genre) {
		if (genre.toUpperCase(Locale.getDefault()).equals("F") || genre.toUpperCase(Locale.getDefault()).equals("M")) {
			this.genre =  genre.toUpperCase(Locale.getDefault()).charAt(0); 			
		}
	}
	
	public String getMaritalStatus() {
		return this.maritalStatus;
	} 
	
	public void setMaritalStatus(String maritalStatus) {
		
		if(maritalStatus.toUpperCase(Locale.getDefault()).equals("MARRIED") || maritalStatus.toUpperCase(Locale.getDefault()).equals("NOT_MARRIED") ) {
			this.maritalStatus = maritalStatus.toUpperCase(Locale.getDefault());
		}
	}
	
	public int calculatedPremiumCar() {
		int premiumCar = 500;
		
		if(this.getGenre().equals('M') && this.getMaritalStatus().equals("NOT_MARRIED") && this.getAge() < 25) {
			premiumCar += 1500;
		}
		
		if(this.getGenre().equals('F') || this.getMaritalStatus().equals("MARRIED")) {
			premiumCar -= 200;
		}
		
		if(this.getAge() >= 45 && this.getAge() < 65) {
			premiumCar -= 100;
		}
		
		if(this.getAge() > 80) {
			return -1;
		}
		
		return premiumCar;
	}
}
