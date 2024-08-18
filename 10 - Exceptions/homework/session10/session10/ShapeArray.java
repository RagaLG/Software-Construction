/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment 10
The purpose of this assignment is to help us understand Exceptions and use them in classes
*/
package session10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ShapeArray {
    /**
     * Save an array of Shape objects to a file.
     *
     * @param shapes    An array of Shape objects to be saved.
     * @param filename  The name of the file where the shapes will be saved.
     */
    /*public static void saveShapesToFile(Shape[] shapes, String filename) {
        try {
            // Create a PrintWriter to write to the file
            PrintWriter writer = new PrintWriter(new FileWriter(filename));

            // Loop through the array of shapes
            for (Shape shape : shapes) {
                // Use the printShape method to format the information
                printShapeToWriter(shape, writer);
            }

            // Close the PrintWriter to save data to the file
            System.out.println("Saved shapes to File");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Print the properties of a Shape to a PrintWriter.
     *
     * @param shape   The Shape to be printed.
     * @param writer  The PrintWriter used to write the Shape properties.
     */
    /*public static void printShapeToWriter(Shape shape, PrintWriter writer) {
        writer.println("Shape: " + shape.getClass());
        writer.println("  position: " + shape.getPos());
        writer.println("  area: " + shape.area());
        writer.println("  perimeter: " + shape.perimeter());
        writer.println("  fill color: " + shape.getFillColor());
        writer.println("  outline: " + shape.getLineColor());
        writer.println(); // Empty line to separate shapes
    }*/
    private static void saveShapesToFile(Shape[] shapesArray, String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Shape shape : shapesArray) {
                if (shape instanceof Circle) {
                    writer.println("Circle " + ((Circle) shape).getRadius());
                } else if (shape instanceof Rectangle) {
                    writer.println("Rectangle " + ((Rectangle) shape).getWidth() + " " + ((Rectangle) shape).getHeight());
                } else if (shape instanceof Triangle) {
                    writer.println("Triangle " + ((Triangle) shape).getSide());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error saving shapes to the file: " + e.getMessage());
        }
    }
    /**
     * Load an array of Shape objects from a file.
     *
     * @param filename  The name of the file where the shapes will be loaded from.
     * @return  An array of Shape objects loaded from the file.
     */
    /*public static Shape[] loadShapesToFile(String filename) {
        List<Shape> shapesList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Create a shape from the serialized data
                Shape shape = createShapeFromSerializedData(line);
                if (shape != null) {
                    shapesList.add(shape);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert the list of shapes to an array
        return shapesList.toArray(new Shape[0]);
    }
    /**
     * Create a Shape object from a line of serialized data.
     *
     * @param serializedData  A line of serialized data.
     * @return  A Shape object created from the serialized data.
     */
    /*public static Shape createShapeFromSerializedData(String serializedData) {
        
        return null;
    }*/
    private static Shape[] loadShapesToFile(String filename) {
        List<Shape> loadedShapes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length > 1) {
                    String shapeType = parts[0];
                    if (shapeType.equals("Circle")) {
                        Circle circle = new Circle();
                        circle.setRadius(Double.parseDouble(parts[1]));
                        loadedShapes.add(circle);
                    } else if (shapeType.equals("Rectangle")) {
                        Rectangle rectangle = new Rectangle();
                        rectangle.setWidth(Double.parseDouble(parts[1]));
                        rectangle.setHeight(Double.parseDouble(parts[2]));
                        loadedShapes.add(rectangle);
                    } else if (shapeType.equals("Triangle")) {
                        Triangle triangle = new Triangle();
                        triangle.setSide(Double.parseDouble(parts[1]));
                        loadedShapes.add(triangle);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading shapes from the file: " + e.getMessage());
        }

        return loadedShapes.toArray(new Shape[0]);
    }
    /**
     * Main method to generate random shapes, save them to a file, and print them.
     *
     * @param args  The command-line arguments (not used in this example).
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arraySize;
        do{
            System.out.print("Enter a arraySize between 2 and 20: ");
            arraySize = scanner.nextInt();
        } while(arraySize<2 || arraySize>20);

        Random random = new Random();
        Shape[] diffShapes = new Shape[arraySize];

        for(int i=0; i<arraySize; i++){
            int shapePrim = random.nextInt(2);
            shapePrim +=1;
            String[] colors = {"green", "red", "blue", "yellow"};
            String[] colors1 = {"violet", "black", "brown", "transparent"};
            String fillColor = colors[random.nextInt(colors.length)];
            String lineColor = colors1[random.nextInt(colors.length)];
            Position pos = new Position(random.nextInt(200), random.nextInt(200));
            switch(shapePrim){
                case 1:
                    double radius = random.nextDouble();
                    diffShapes[i] = new Circle(pos, fillColor, lineColor, radius);
                    break;
                case 2:
                    double height = random.nextDouble();
                    double width = random.nextDouble();
                    diffShapes[i] = new Rectangle(pos, fillColor, lineColor, width, height);
                    break;
                case 3:
                    double side = random.nextDouble();
                    diffShapes[i] = new Triangle(pos, fillColor, lineColor, side);
                    break;
            }
        }
        for(Shape s: diffShapes){
            ShapeMover.printShape(s);
        }
        saveShapesToFile(diffShapes, "DifferentShapes.txt");
        Shape[] listOfShapes = loadShapesToFile("DifferentShapes.txt");
        System.out.println("Loaded Shapes: ");
        for (Shape shape : diffShapes) {
            ShapeMover.printShape(shape);
        }
    }
}
// end of class ShapeArray
