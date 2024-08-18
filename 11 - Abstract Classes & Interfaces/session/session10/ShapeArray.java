/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW11
The purpose of this assignment is to help us learn to implement Abstract Classes, 
Abstract Methods and Interfaces.
*/
package session10;

import java.util.Random;
import java.util.Scanner;

public class ShapeArray {
/**
 * Searches for a shape in an array of Shape objects that matches a given target shape 
 * based on position, fill color, line color, and specific shape properties(Circle, Rectangle, Triangle).
 *
 * @param shapes The array of Shape objects to search within.
 * @param target The target Shape object to find a match for.
 * @return True if a matching shape is found in the array, false otherwise.
 */
    public static boolean findShape(Shape[] shapes, Shape target){
        for(Shape s: shapes){
            if(s.getPos() == target.getPos() &&
            s.getFillColor() == target.getFillColor() &&
            s.getLineColor() == target.getLineColor()){
                if(target instanceof Circle){
                    if(((Circle) s).getRadius() == ((Circle) target).getRadius()){
                        return true;
                    }
                } else if(target instanceof Rectangle){
                    if(((Rectangle) s).getWidth() == ((Rectangle) target).getWidth() &&
                    ((Rectangle) s).getHeight() == ((Rectangle) target).getHeight()){
                        return true;
                    }
                } else if(target instanceof Triangle){
                    if(((Triangle) s).getSide() == ((Triangle) target).getSide()){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    /**
     * Checks if an array of Shape objects is sorted based on their areas.
     *
     * @param shapes An array of Shape objects to check.
     * @return True if the array is sorted, false otherwise.
     */
    public static boolean sorted(Shape[] shapes){
        for(int i=0; i<shapes.length-1; i++){
            if(shapes[i].getArea() > shapes[i+1].getArea()){
                return false;
            }
        }
        return true;
    }
     /**
     * Swaps two elements in an array of Shape objects.
     *
     * @param shapes The array of Shape objects.
     * @param a      The index of the first element to swap.
     * @param b      The index of the second element to swap.
     * @return The updated array after the swap.
     */
    public static Shape[] swap(Shape[] shapes, int a, int b){
        Shape temp = shapes[a];
        shapes[a] = shapes[b];
        shapes[b] = temp;
        return shapes;
    }
    /**
     * Sorts an array of Shape objects based on their areas in ascending order.
     *
     * @param shapes The array of Shape objects to be sorted.
     * @return The sorted array of Shape objects.
     */
    public static Shape[] sortShape(Shape[] shapes) {
        int currentIndex = 0;
        while(!sorted(shapes)){
            int minIndex = currentIndex;
            for(int i=currentIndex; i<shapes.length; i++){
                if(shapes[i].getArea() < shapes[minIndex].getArea()){
                    minIndex = i;
                }
            }
            swap(shapes, currentIndex, minIndex);
            currentIndex++;
        }
        return shapes;
    }
    /**
     * Main method generates random shapes, sorts them using sortShape, and searches for a specific 
     * shape in the array using findShape.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arraySize;
        do{
            System.out.println("Enter a arraySize between 2 and 20: ");
            arraySize = scanner.nextInt();
        } while(arraySize < 2 || arraySize > 20);

        Random random = new Random();
        Shape[] diffShapes = new Shape[arraySize];
        String[] colors = {"green", "red", "blue", "yellow"};
        String[] colors1 = {"violet", "black", "brown", "transparent"};
        String fillColor1 = colors[random.nextInt(colors.length)];
        String lineColor1 = colors1[random.nextInt(colors.length)];

        for(int i=0; i<arraySize; i++){
            int shapePrim = random.nextInt(2);
            String fillColor = colors[random.nextInt(colors.length)];
            String lineColor = colors1[random.nextInt(colors.length)];
            Position pos = new Position(random.nextInt(200), random.nextInt(200));
            switch(shapePrim){
                case 0:
                    double radius = random.nextDouble();
                    diffShapes[i] = new Circle(pos, fillColor, lineColor, radius);
                    break;
                case 1:
                    double height = random.nextDouble();
                    double width = random.nextDouble();
                    diffShapes[i] = new Rectangle(pos, fillColor, lineColor, width, height);
                    break;
                case 2:
                    double side = random.nextDouble();
                    diffShapes[i] = new Triangle(pos, fillColor, lineColor, side);
                    break;
            }
        }
        for(Shape s: diffShapes){
            System.out.println(s + "    Area: " + s.getArea());
        }
        System.out.println();
        
        Shape[] sortedShapes = sortShape(diffShapes);
        // Loop through the sorted array and print objects
        System.out.println("Sorted Shapes:");
        for (Shape shape : sortedShapes) {
            System.out.println(shape + "    Area: " + shape.getArea());
        }
        System.out.println();

        System.out.println("Looping through randomly created shapes: ");
        for(Shape s: diffShapes){
            System.out.println(s);
        }
        System.out.println();

        Position randomPos = new Position(random.nextInt(200), random.nextInt(200));
        Shape randomShape = new Rectangle(randomPos, fillColor1, lineColor1, random.nextDouble(), random.nextDouble());
        System.out.println("Randomly created array and a randomly created object:");
        System.out.println("Random Shape: " + randomShape);
        System.out.println(findShape(diffShapes, randomShape));
        System.out.println("Randomly created array and the object of its first cell: ");
        System.out.println(findShape(diffShapes, diffShapes[0]));
    }
}
// end of class ShapeArray
