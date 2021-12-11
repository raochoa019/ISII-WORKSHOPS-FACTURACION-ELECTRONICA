package ec.edu.espol.workshops;

import java.util.Locale;

/**
 * Clase que define el seguro del auto.
 *
 * @authors  Facturacion
 * 
* */

public class CarInsurance {

  private Integer age;
  private char genre;
  private String maritalStatus;
  private static final String generoF = "F";
  private static final String generoM = "M";
  private static final String casado = "MARRIED";
  private static final String soltero = "NOT MARRIED";
  private static final int edadMax = 80;
  private transient int premiumCar = 600;

  
  /**
   * Constructor que define el seguro del auto.
   *
   * @param age Parametro de edad
   *
   * @param genre Parametro del genero
   *
   * @param maritalStatus Parametro del estado civil
   *
   */
  
  public CarInsurance(Integer age, char genre, String maritalStatus) {
    this.setAge(age);
    this.setGenre(genre);
    this.setMaritalStatus(maritalStatus);
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
  
  /**
   * Setea el genero de la persona.
   *
   * @param genre
   *
   */
  
  public void setGenre(Character genre) {
	if (generoF.equalsIgnoreCase(genre.toString()) || generoM.equalsIgnoreCase(genre.toString())) {
      this.genre = genre.toString().toUpperCase(Locale.getDefault()).charAt(0);
    }
  }

  public String getMaritalStatus() {
    return this.maritalStatus;
  } 
  
  /**
   * Setea el estado civil de la persona.
   *
   * @param maritalStatus
   *
   */
  
  public void setMaritalStatus(String maritalStatus) {
    if (casado.equalsIgnoreCase(maritalStatus) || soltero.equalsIgnoreCase(maritalStatus)) {
      this.maritalStatus = maritalStatus.toUpperCase(Locale.getDefault());
    }
  }
  
  /**
   * Calcula el valor del carro.
   *
   * @return el valor del carro
   *
   */
  
  public int calculatedPremiumCar() {

    if (this.getGenre().equals('M') && soltero.equals(this.getMaritalStatus()) && this.getAge() < 25) {
      premiumCar += 1500;
    }

    if (this.getGenre().equals('F') || casado.equals(this.getMaritalStatus())) {
      premiumCar -= 200;
    }

    if (this.getAge() >= 45 && this.getAge() < 65) {
      premiumCar -= 100;
    }

    if (this.getAge() > edadMax) {
      return -1;
    }

    return premiumCar;
  }
}
