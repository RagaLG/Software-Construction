/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us learn sort methods and understand the concept of 
Objects(individual instance of a class) and define methods to modify or use them.
*/
package homework.geometry;

public class Point {
    private Double abscissa;
    private Double ordinate;
    /**
     * Constructs a new `Point` object with the specified abscissa and ordinate.
     * @param abscissa The x-coordinate of the point.
     * @param ordinate The y-coordinate of the point.
     */
    public Point(Double abscissa, Double ordinate){
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }
    /**
     * Gets the x-coordinate (abscissa) of the point.
     * @return The x-coordinate of the point.   
     */
    public Double getAbscissa(){
        return this.abscissa;
    }
    /**
     * Gets the y-coordinate (ordinate) of the point.
     * @return The y-coordinate of the point.
     */
    public Double getOrdinate(){
        return this.ordinate;
    }
}
// end of class Point
