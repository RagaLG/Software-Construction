/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us learn sort methods and understand the concept of 
Objects(individual instance of a class) and define methods to modify or use them.
*/
package homework.geometry;

public class Circle {
    private Point center;
    private Double radius;
    /**
     * Constructs a new `Circle` object with the specified center point and radius.
     * @param center The center point of the circle.
     * @param radius The radius of the circle.
     */
    public Circle(Point center, Double radius){
        this.center = center;
        this.radius = radius;
    }
    /**
     * Calculates and returns the perimeter of the circle.
     * @return The perimeter of the circle.
     */
    public Double perimeter(){
        Double peri = 2*Math.PI*this.radius;
        return peri; 
    }
    /**
     * Calculates and returns the area of the circle.
     * @return The area of the circle.
     */
    public Double area(){
        Double ar = Math.PI*this.radius*this.radius;
        return ar;
    }
    /**
     * Tests whether a given point is inside or on the boundary of the circle.
     * @param point The point to be tested for its position relative to the circle.
     * @return `true` if the point belongs to the circle, `false` otherwise.
     */
    public boolean testAppartenance(Point point){
        Double x = point.getAbscissa() - center.getAbscissa();
        Double y = point.getAbscissa() - center.getAbscissa();
        Double distance = Math.sqrt(x*x + y*y);
        return distance <= this.radius;
    }
    /**
     * Displays information about the circle - center, radius, perimeter, and area.
     */
    public void display(){
        System.out.println("Circle Center: " + center.getAbscissa() + ", " + center.getOrdinate());
        System.out.println("Circle Radius: " + this.radius);
        System.out.println("Perimater: " + perimeter());
        System.out.println("Area: " + area());
    }
}
// end of class Circle
