/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW11
The purpose of this assignment is to help us learn to implement Abstract Classes, 
Abstract Methods and Interfaces.
*/
package session10;

/**
 * Utility class that can be used to move or print shapes.
 */
public class ShapeMover {
    /**
     * Scales a figure by a specified factor.
     *
     * @param figure The figure to scale.
     * @param factor The scaling factor.
     */
    public static void scaleFigure(Figure figure, double factor) {
        System.out.println("BEFORE SCALING");
        printShape(figure);
        
        figure.scale(factor);
        
        System.out.println("AFTER SCALING");
        printShape(figure);
    }
    /**
     * Prints a shape, moves it to a new position, and then prints it again.
     *
     * @param figure   The Figure to be moved.
     * @param position The new position to which the shape should me moved.
     */
    public static void moveShape(Figure figure, Position position) {
        System.out.println("BEFORE MOVING");
        printShape(figure);

        figure.move(position);

        System.out.println("AFTER MOVING");
        printShape(figure);
    }

    /**
     * Prints the details about a shape including the class name, position,
     * area, perimeter, fill color, and outline.
     *
     * @param figure The Figure to be printed.
     */
    public static void printShape(Figure figure) {
        System.out.println("Shape: " + figure.getClass());
        System.out.println("  position: " + figure.getPos());
        System.out.println("  area: " + figure.getArea());
        System.out.println("  perimeter: " + figure.getPerimeter());
        System.out.println("  fill color: " + figure.getFillColor());
        System.out.println("  outline: " + figure.getLineColor() + "\n");
    }

    /**
     * Tests the move method with various different shapes.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        //Shape shape = new Shape(new Position(100, 100), "Red", "Blue");
        //moveShape(shape, new Position(200, 200));

        Rectangle rectangle = new Rectangle(new Position(50, 50), "Brown",
                "Yellow", 100, 50);
        moveShape(rectangle, new Position(25, 75));
        scaleFigure(rectangle, 2.0);

        Circle circle = new Circle(new Position(0, 10), "Transparent",
                "Black", 150);
        moveShape(circle, new Position(10, 0));
        scaleFigure(circle, 5.0);

        Triangle triangle = new Triangle(new Position(-30, -50), "Blue",
                "Orange", 125);
        moveShape(triangle, new Position(-100, -200));
        scaleFigure(triangle, 3.0);
    }

}
// end of class ShapeMover
