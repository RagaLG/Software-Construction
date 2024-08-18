/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us learn sort methods and understand the concept of 
Objects(individual instance of a class) and define methods to modify or use them.
*/
package homework;

import java.util.Scanner;
import homework.geometry.Point;
import homework.geometry.Circle;

public class TestCircle {
    /**
     * The main method for testing the `Circle` class.
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Input the center coordinates for the circle.
        System.out.println("Enter coordinates for the center of the circle: ");
        System.out.print("Abscissa: ");
        Double abscissa = scanner.nextDouble();
        System.out.print("Ordinate: ");
        Double ordinate = scanner.nextDouble();
        Point center = new Point(abscissa, ordinate);
         // Input the radius of the circle.
        System.out.print("Enter radius of the circle: ");
        Double radius = scanner.nextDouble();
        Circle circle = new Circle(center, radius);
        // Input coordinates for a testing point.
        System.out.println("Enter coordinates for a point: ");
        System.out.print("Abscissa: ");
        Double abscissap = scanner.nextDouble();
        System.out.print("Ordinate: ");
        Double ordinatep = scanner.nextDouble();
        System.out.println();
        Point randomPoint = new Point(abscissap, ordinatep);
        // Check if the testing point belongs to the circle.
        boolean pointBelongs = circle.testAppartenance(randomPoint);
        
        // Display circle details and test result.
        System.out.println("Circle Details: ");
        circle.display();
        System.out.println();
        System.out.println("Coordinates of testing point: " + abscissap + ", " + ordinatep);
        if(pointBelongs){
            System.out.println("The point belongs to the circle.");
        } else {
            System.out.println("The point does not belong to the circle.");
        }
        scanner.close();
    }
}
// end of class TestCircle
