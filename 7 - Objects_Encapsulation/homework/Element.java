/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us learn sort methods and understand the concept of 
Objects(individual instance of a class) and define methods to modify or use them.
*/
package homework;

public class Element {
    private String name;
    private String symbol;
    private int atomicNumber;
    private Double atomicWeight;
    /**
     * Constructs an Element object with the specified attributes.
     * @param name         The name of the element.
     * @param symbol       The symbol of the element.
     * @param atomicNumber The atomic number of the element.
     * @param atomicWeight The atomic weight of the element.
     */
    public Element(String name, String symbol, int atomicNumber, Double atomicWeight){
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
    /**
     * Retrieves the name of the element.
     * @return The name of the element.
     */
    public String getName(){
        return this.name;
    }
    /**
     * Sets the name of the element.
     * @param name The new name of the element.
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Retrieves the symbol of the element.
     * @return The symbol of the element.
     */
    public String getSymbol(){
        return this.symbol;
    }
    /**
     * Sets the symbol of the element.
     * @param newSymbol The new symbol of the element.
     */
    public void setSymbol(String newSymbol){
        this.symbol = newSymbol;
    }
    /**
     * Returns a formatted string representation of the Element object.
     * @return A string displaying the element's name, symbol, atomic number, and atomic weight.
     */
    public String toString(){
        return "Element: " + "Name= " + this.name +
                ", Symbol= " + this.symbol +
                ", Atomic Number= " + this.atomicNumber +
                ", Atomic Weight= " + this.atomicWeight;
    }
    /**
     * Demonstrates the usage of the Element class by creating 10 Element objects,
     * printing their information, and modifying one element's name and symbol.
     * @param args
     */
    public static void main(String[] args){
        Element hydrogen = new Element("Hydrogen", "H", 1, 1.008);
        Element helium = new Element("Helium", "He", 2, 4.0026);
        Element lithium = new Element("Lithium", "Li", 3, 6.94);
        Element oxygen = new Element("Oxygen", "O", 8, 15.999);
        Element carbon = new Element("Carbon", "C", 6, 12.011);
        Element nitrogen = new Element("Nitrogen", "N", 7, 14.007);
        Element sodium = new Element("Sodium", "Na", 11, 22.990);
        Element potassium = new Element("Potassium", "K", 19, 39.098);
        Element fluorine = new Element("Fluorine", "F", 9, 18.998);
        Element neon = new Element("Neon", "Ne", 10, 20.180);

        Element[] elements = {hydrogen, helium, lithium, oxygen, carbon, nitrogen, sodium, potassium, fluorine, neon};

        for (Element element : elements) {
            System.out.println(element);
        }
        hydrogen.setSymbol("Hy");
        hydrogen.setName("Hydro");
        System.out.println();
        System.out.println("Changed Hydrogen name and symbol: ");
        for (Element element : elements) {
            System.out.println(element);
        }
    }
}
// end of class Element
