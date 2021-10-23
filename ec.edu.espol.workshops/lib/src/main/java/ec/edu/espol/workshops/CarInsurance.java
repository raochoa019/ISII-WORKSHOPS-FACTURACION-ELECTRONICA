package ec.edu.espol.workshops;

/**
 * Clase que define el seguro del auto.
 *
 * @author: Bryan
 * 
* */


public class CarInsurance {

  private Integer age;
  private char genre;
  private String maritalStatus;

  public CarInsurance() {}
  
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
  
  /**
   * Setea el genero de la persona.
   *
   * @param genre
   *
   */
  
  public void setGenre(String genre) {
    if (genre.toUpperCase().equals("F") || genre.toUpperCase().equals("M")) {
      this.genre = genre.toUpperCase().charAt(0);
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
    if (maritalStatus.toUpperCase().equals("MARRIED") || maritalStatus.toUpperCase().equals("NOT_MARRIED")) {
      this.maritalStatus = maritalStatus.toUpperCase();
    }
  }
  
  /**
   * Calcula el valor del carro.
   *
   * @return el valor del carro
   *
   */
  
  public int calculatedPremiumCar() {
    int premiumCar = 500;

    if (this.getGenre() == 'M' && this.getMaritalStatus() == "NOT_MARRIED" && this.getAge() < 25) {
      premiumCar += 1500;
    }

    if (this.getGenre() == 'F' || this.getMaritalStatus() == "MARRIED") {
      premiumCar -= 200;
    }

    if (this.getAge() >= 45 && this.getAge() < 65) {
      premiumCar -= 100;
    }

    if (this.getAge() > 80) {
      return -1;
    }

    return premiumCar;
  }
}
