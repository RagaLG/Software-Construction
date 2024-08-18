/*
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW12
The purpose of this assignment is to help us learn databases and use JAVA to run queries and get results.
*/
package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class ShapeCreator {

    private Connection connection;
    /**
     * Constructor for the ShapeCreator class.
     *
     * @param dbUrl      The URL of the MySQL database.
     * @param dbUser     The username for the database connection.
     * @param dbPassword The password for the database connection.
     * @throws SQLException If a database connection error occurs.
     */
    public ShapeCreator(String dbUrl, String dbUser, String dbPassword) throws SQLException {
        connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
    }
    /**
     * Creates tables in the database for Circle, Rectangle, and Triangle shapes.
     */
    public void createTables() {
        try {
            Statement statement = connection.createStatement();

            // Create a table for Circle
            statement.execute("CREATE TABLE IF NOT EXISTS Circle (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "radius INT, " +
                    "x INT, " +
                    "y INT" +
                    ")");

            // Create a table for Rectangle
            statement.execute("CREATE TABLE IF NOT EXISTS Rectangle (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "width INT, " +
                    "height INT, " +
                    "x INT, " +
                    "y INT" +
                    ")");

            // Create a table for Triangle
            statement.execute("CREATE TABLE IF NOT EXISTS Triangle (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "side1 INT, " +
                    "side2 INT, " +
                    "side3 INT, " +
                    "x1 INT, " +
                    "y1 INT, " +
                    "x2 INT, " +
                    "y2 INT, " +
                    "x3 INT, " +
                    "y3 INT" +
                    ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Populates the tables in the database with random data for Circle, Rectangle, and Triangle shapes.
     */
    public void populateTables() {
        Random random = new Random();

        try {
            Statement statement = connection.createStatement();

            for (int i = 0; i < 10; i++) {
                // Insert 10 random circles
                int radius = random.nextInt(20) + 1;
                int x = random.nextInt(20) + 1;
                int y = random.nextInt(20) + 1;
                statement.execute("INSERT INTO Circle (radius, x, y) VALUES (" + radius + ", " + x + ", " + y + ")");

                // Insert 10 random rectangles
                int width = random.nextInt(20) + 1;
                int height = random.nextInt(20) + 1;
                x = random.nextInt(20) + 1;
                y = random.nextInt(20) + 1;
                statement.execute("INSERT INTO Rectangle (width, height, x, y) VALUES (" + width + ", " + height + ", " + x + ", " + y + ")");

                // Insert 10 random triangles
                int side1 = random.nextInt(20) + 1;
                int side2 = random.nextInt(20) + 1;
                int side3 = random.nextInt(20) + 1;
                int x1 = random.nextInt(20) + 1;
                int y1 = random.nextInt(20) + 1;
                int x2 = random.nextInt(20) + 1;
                int y2 = random.nextInt(20) + 1;
                int x3 = random.nextInt(20) + 1;
                int y3 = random.nextInt(20) + 1;
                statement.execute("INSERT INTO Triangle (side1, side2, side3, x1, y1, x2, y2, x3, y3) VALUES (" +
                        side1 + ", " + side2 + ", " + side3 + ", " + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ", " + x3 + ", " + y3 + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * The main method creates an instance of ShapeCreator, establishes a database connection,
     * creates tables, and populates them with random data.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3307/shapedb";
        String dbUser = "root";
        String dbPassword = "";

        try {
            ShapeCreator shapeCreator = new ShapeCreator(dbUrl, dbUser, dbPassword);
            shapeCreator.createTables();
            shapeCreator.populateTables();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
// end of class ShapeCreator
