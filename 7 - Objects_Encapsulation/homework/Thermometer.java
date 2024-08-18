/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us learn sort methods and understand the concept of 
Objects(individual instance of a class) and define methods to modify or use them.
*/
package homework;
import java.lang.Math;

public class Thermometer {
    private double tempCelsius;
    /**
     * Constructs a new `Thermometer` object with an initial temperature of 37 degrees Celsius.
     */
    public Thermometer(){
        this.tempCelsius = 37;
    }
    /**
     * Gets the temperature in Celsius.
     * @return The temperature in Celsius.
     */
    public Double getCelsius(){
        return this.tempCelsius;
    }
    /**
     * Sets the temperature in Celsius.
     * @param newCelsius The new temperature value in Celsius.
     */
    public void setCelsius(Double newCelsius){
        this.tempCelsius = newCelsius;
    }
    /**
     * Calculates and returns the temperature in Fahrenheit.
     * @return The temperature in Fahrenheit.
     */
    public Double getFahrenheit(){
        return (this.tempCelsius * 9/5) + 32;
    }
    /**
     * Sets the temperature in Fahrenheit, which is then converted to Celsius.
     * @param newFahrenheit The new temperature value in Fahrenheit.
     */
    public void setFahrenheit(Double newFahrenheit){
        this.tempCelsius = (newFahrenheit - 32)*5/9;
    }
    /**
     * Calculates and returns the temperature in Kelvin.
     * @return The temperature in Kelvin.
     */
    public Double getKelvin(){
        return this.tempCelsius + 273.15;
    }
    /**
     * Sets the temperature in Kelvin, which is then converted to Celsius.
     * @param newKelvin The new temperature value in Kelvin.
     */
    public void setKelvin(Double newKelvin){
        this.tempCelsius = newKelvin - 273.15;
    }
    /**
     * Returns a string representation of the temperature value in Celsius, Fahrenheit, and Kelvin.
     * @return A string representation of the temperature values.
     */
    public String toString(){
        return "The temperature in Celsius: " + Math.round(getCelsius()*100)/100.0 + " C" + 
        "\nThe temperature in Fahrenheit: " + Math.round(getFahrenheit()*100)/100.0 + " F" +
        "\nThe temperature in Kelvin: " + Math.round(getKelvin()*100)/100.0 + " K";
    }
    /**
     * The main method for testing the `Thermometer` class.
     * @param args
     */
    public static void main(String[] args){
        Thermometer temp1 = new Thermometer();
        //System.out.println("Initial Temperature:");
        System.out.println(temp1);
        System.out.println();
        Thermometer temp2 = new Thermometer();
        temp2.setFahrenheit(212.0);
        System.out.println(temp2);
        System.out.println();
        Thermometer temp3 = new Thermometer();
        temp3.setKelvin(34.0);
        System.out.println(temp3);
    }
}
// end of class Thermometer
