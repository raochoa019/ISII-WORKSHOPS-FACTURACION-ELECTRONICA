package ec.edu.espol.workshops;

import java.util.Locale;

/**
*
* @authors  Facturacion
* @param age
*
*/
public class CarInsurance {
	private Integer age;
	private char genre;
	private String maritalStatus;
	private static final String generoF = "F";
	private static final String generoM = "M";
	private static final String casado = "MARRIED";
	private static final String soltero = "NOT MARRIED";
	private static final int edadMax = 80;
	private transient int premiumCar = 500; 
	
	/**
	 * @param age, genre, maritalStatus
	 */
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
	
	public char getGenre() {
		return this.genre;
	} 
	
	public void setGenre(String genre) {
		if (generoF.equalsIgnoreCase(genre) || generoM.equalsIgnoreCase(genre)) {
			this.genre =  genre.toUpperCase(Locale.getDefault()).charAt(0); 			
		}
	}
	
	public String getMaritalStatus() {
		return this.maritalStatus;
	} 
	
	public void setMaritalStatus(String maritalStatus) {
		if(casado.equalsIgnoreCase(maritalStatus) || soltero.equalsIgnoreCase(maritalStatus) ) {
			this.maritalStatus = maritalStatus.toUpperCase(Locale.getDefault());
		}
	}
	
	/**
	 * 
	 * @return premiumCar
	 */
	public int calculatedPremiumCar() {
		if(this.getGenre() =='M' && soltero.equals(this.getMaritalStatus()) && this.getAge() < 25) {
			premiumCar += 1500;
		}
		
		if(this.getGenre() =='F' || casado.equals(this.getMaritalStatus())) {
			premiumCar -= 200;
		}
		
		if(this.getAge() >= 45 && this.getAge() < 65) {
			premiumCar -= 100;
		}
		
		if(this.getAge() > edadMax) {
			return -1;
		}
		
		return premiumCar;
	}
}
